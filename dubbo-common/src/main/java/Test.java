import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {

	public static void main(String[] args) {
		try {
			String s = URLEncoder.encode("com.cnblogs.yjmyzz.demo.service.api.thrift.ThriftHelloService%2524Iface", "UTF-8");
			System.out.println(s);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
