package br.com.kafka.kafka

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaConfiguration{
    @Bean
    fun topicCreated(): NewTopic = TopicBuilder.name("Teste").build()

}