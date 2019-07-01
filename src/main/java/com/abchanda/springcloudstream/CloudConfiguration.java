package com.abchanda.springcloudstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Consumer;
import java.util.function.Function;

@Configuration
@EnableBinding(Processor.class)
public class CloudConfiguration {

    @Autowired
    private Processor processor;

    @Bean
    public Consumer<Person> sendToInput(){
        return person -> processor.input().send(MessageBuilder.withPayload(person).build());
    }

    @Bean
    public Function<Person, Person> producer(){
        return person -> person;
    }
}
