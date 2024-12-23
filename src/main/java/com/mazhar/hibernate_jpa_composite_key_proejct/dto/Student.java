package com.mazhar.hibernate_jpa_composite_key_proejct.dto;

import java.io.Serializable;

import com.mazhar.hibernate_jpa_composite_key_proejct.composite.StudentId;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StudentId studentId;
	
	private String name;
}
