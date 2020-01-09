package yan.dok.OpenTracingAppB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableFeignClients
@EnableDiscoveryClient
public class OpenTracingAppBApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenTracingAppBApplication.class, args);
	}

}