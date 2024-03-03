package com.bec.gowrishankarbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private String id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String user_name;

    @Column
    private String email_address;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String postal_code;

    @Column
    private String message;

}
