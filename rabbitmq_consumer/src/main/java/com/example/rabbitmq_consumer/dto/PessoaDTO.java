package com.example.rabbitmq_consumer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {

    private Long cpf;
    private String nome;
    private String sobreNome;
}
