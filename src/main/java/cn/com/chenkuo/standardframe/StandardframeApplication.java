package cn.com.chenkuo.standardframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class StandardframeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardframeApplication.class, args);
	}
}
