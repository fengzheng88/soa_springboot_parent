package config;


import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * 该CustomConfigurationCLAS必须是@Configuration一流的，
 * 但照顾，这是不是在@ComponentScan主应用程序上下文。否则，
 * 将由所有共享@RibbonClients。如果您使用@ComponentScan
 * （或@SpringBootApplication），则需要采取措施避免将其包括在内
 * （例如，您可以将其放在单独的，不重叠的程序包中，或在中指定要扫描的程序包@ComponentScan）。
 */

@Configuration
public class RibbonConfiguration {
    @Autowired
    IClientConfig iClientConfig;

    @Bean
    public IRule ribbonRule(IClientConfig config) {

        return new RandomRule();
    }

}
