
�޸�ע�⣺

1) ������µ�ģ�飬Ҫ��POM��maven-shade-plugin��<artifactSet>�����<include>

2) ������µ���չ�㣬Ҫ��POM��maven-shade-plugin����<transformer>

������ ��չ�������ļ� ������

$ find . -wholename */META-INF/dubbo/* -type f | grep -vF /test/ | awk -F/ '{print $NF}' | sort -u
com.alibaba.dubbo.cache.CacheFactory
com.alibaba.dubbo.common.compiler.Compiler
com.alibaba.dubbo.common.extension.ExtensionFactory
...and so on...


ʵ�����⣺

	1.�ڲ���thrift�ķ���ʱ������zookeeper������,Ȼ������dubbo����,������dubbo-admin���̷�����<dubbo:service interface="com.xxx.xxx.xxService$Iface" />��interface��'$'�ڷ���ע�ᵽzookeeperʱ�Ὣ���ֵ��URLEncode.encode(value)ת���'%24'Ȼ��������������Ǹ�ֵ��һ��������ע��ʱ��URLEncode.encode(value)ת���'%2524'��Ȼ��һֱ���ڴ����µĽڵ�(��ѭ����,'%'ת��Ϊ'%25'),��ʱ��������ǽ�dubbo-common/com.alibaba.dubbo.common.URL��ķ���encode()�޸����£��������Զ���ķ��������������������ַ����߼���Ĭ�ϴ�����'$'��,��dubbo-admin�������dubbo�汾Ϊ2.5.3,�ֶ������URL���URL.class�ļ�������jar�е�URL.class,������dubbo-adminʱδ�����������