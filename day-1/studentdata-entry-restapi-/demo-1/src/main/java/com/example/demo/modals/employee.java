package com.example.demo.modals;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class employee {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String rollno;
		private String name;
		private String branch;
		@Email
		private String email;
		private String password;

	}

