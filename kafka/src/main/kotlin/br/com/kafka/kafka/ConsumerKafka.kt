package br.com.kafka.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class ConsumerKafka {

    @KafkaListener(topics = ["Teste"])
    fun listener(msg: String){
        println(msg)
    }
}

@Service
class ProduceKafka(
        val kafkaTemplate: KafkaTemplate<String, String>
){
    fun sendMensage(message:String){
        kafkaTemplate.send("Teste",message)
    }
}