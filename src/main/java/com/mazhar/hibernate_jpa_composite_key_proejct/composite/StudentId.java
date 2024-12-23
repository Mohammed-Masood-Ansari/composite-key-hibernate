package com.mazhar.hibernate_jpa_composite_key_proejct.composite;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentId implements Serializable{
	
	private int id;
	private String email;
	private long phone;

}
