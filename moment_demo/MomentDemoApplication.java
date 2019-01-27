package cn.surine.moment_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.surine.moment_demo.Mapper")
public class MomentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MomentDemoApplication.class, args);
	}

}

