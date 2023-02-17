package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tb_customer")
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int cusid;
    private String cusname;
private int cusaccountNo;

private long cusbalance;


    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Date created_at;

    @Column(nullable = false, updatable = true)
    @CreationTimestamp
    private Date updated_at;

@OneToMany(targetEntity = Transaction.class,cascade = CascadeType.ALL)
@JoinColumn(name = "ct_fk",referencedColumnName = "cusid")
private List<Transaction> transaction;


//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book", fetch = FetchType.LAZY)
//    private List<Review> reviews;
}
