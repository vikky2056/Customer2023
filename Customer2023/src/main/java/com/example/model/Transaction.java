package com.example.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@EqualsAndHashCode
public class Transaction {
@Id
private int tranid;
private String tranname;
private int tranamout;
private int Remainingbal;



@ManyToOne
@JoinColumn(name = "cusid")
private Customer customer;


//    @ManyToOne
//    @JoinColumn(name = "book_id")
//    private Book book;
}
