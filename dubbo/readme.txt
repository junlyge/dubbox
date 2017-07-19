
修改注意：

1) 添加了新的模块，要在POM中maven-shade-plugin的<artifactSet>中添加<include>

2) 添加了新的扩展点，要在POM中maven-shade-plugin加上<transformer>

搜索出 扩展点配置文件 的命令

$ find . -wholename */META-INF/dubbo/* -type f | grep -vF /test/ | awk -F/ '{print $NF}' | sort -u
com.alibaba.dubbo.cache.CacheFactory
com.alibaba.dubbo.common.compiler.Compiler
com.alibaba.dubbo.common.extension.ExtensionFactory
...and so on...


实测问题：

	1.在测试thrift的服务时，启动zookeeper服务器,然后启动dubbo服务,再启动dubbo-admin工程发现因<dubbo:service interface="com.xxx.xxx.xxService$Iface" />中interface含'$'在服务注册到zookeeper时会将这个值做URLEncode.encode(value)转义成'%24'然后因这个与上面那个值不一样导致再注册时调URLEncode.encode(value)转义成'%2524'，然后一直就在创建新的节点(死循环了,'%'转义为'%25'),暂时解决方法是将dubbo-common/com.alibaba.dubbo.common.URL类的方法encode()修改了下，增加了自定义的方法，加入了跳过特殊字符的逻辑（默认传入了'$'）,而dubbo-admin中引入的dubbo版本为2.5.3,手动将这个URL类的URL.class文件覆盖了jar中的URL.class,再启动dubbo-admin时未发现这个问题