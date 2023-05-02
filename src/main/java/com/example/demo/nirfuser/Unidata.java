package com.example.demo.nirfuser;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Unidata {
	@Id
	public String _id;

	private String payload;
	private String email;
	private String uniname;
	private String creationinfo;
	private String updationinfo;
}
