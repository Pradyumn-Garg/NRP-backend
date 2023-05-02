package com.example.demo.nirfuser;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Getunidata {
	@Id
	public String _id;

	private String email;
}
