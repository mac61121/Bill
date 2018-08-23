package cn.bdqn.billprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.bdqn.billprovider.dao")
public class BillProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillProviderApplication.class, args);
    }
}
