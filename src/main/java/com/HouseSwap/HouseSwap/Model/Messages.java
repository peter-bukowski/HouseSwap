package com.HouseSwap.HouseSwap.Model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="messages")
public class Messages {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="receiver")
    private String receiver;


    @Column(name="message")
    private String message;

}
