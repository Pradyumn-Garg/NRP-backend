package com.example.demo.nirfuser;
import org.springframework.data.annotation.Id;
import lombok.Data;

@Data

public class Userdata {
	@Id
	public String _id;

	private String email;
	private String password;
	private String firstname;
	private String lastname;

}
