package com.example.rabbitmq_consumer.listeners;

import com.example.rabbitmq_consumer.dto.PessoaDTO;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PessoaListener {

    @RabbitListener(queues = "pessoa.ok")
    public void filaPessoaOk(PessoaDTO pessoaDTO){
        System.out.println("Mensagem recebida: " + pessoaDTO.toString());
    }
}
