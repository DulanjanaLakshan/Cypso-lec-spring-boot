package com.cypsolabs.crud.entity;

import com.cypsolabs.crud.enums.BlogStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

/**
 * @author Dulanjana Lakshan Kumarasingha
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Blog {
    @Id
    @Column(name = "BLOGID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "BLOG_STATUS")
    private BlogStatus status;
    @Column(name = "UPDATE_DATE")
    private Date update;
    @Column(name = "CREATE_DATE")
    private Date create;
    @Column(name = "AUTH")
    private UUID authId;
    @Column(name = "CONTACT")
    private String content;
}