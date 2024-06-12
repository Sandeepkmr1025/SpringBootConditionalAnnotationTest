package com.sandeep.springbootconditionalannotationtest.configs;

import com.sandeep.springbootconditionalannotationtest.models.SampleBean;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    @Bean
    //@Conditional(MyCondition.class)
    //@ConditionalOnProperty(name = "initializeBean", havingValue = "true")
    //@ConditionalOnProperty(name = "bean", havingValue = "true", prefix = "initialize")
    //@ConditionalOnJava(JavaVersion.EIGHTEEN)
    //@ConditionalOnProperty(name = "initializeBean", matchIfMissing = true)
    //@ConditionalOnBean(value = SampleBean.class) // If Spring IOC container does not have this bean then it won't initialize.
    //@ConditionalOnMissingBean(value = SampleBean.class)
    @ConditionalOnExpression("'${initializeBean}'.equals('true')")
    public SampleBean getSampleBean() {
        return new SampleBean();
    }

}
