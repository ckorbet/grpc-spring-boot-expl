package com.carlos.torres.model.impl;

import java.io.Serializable;

import com.carlos.torres.model.HelloFullNameRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class HelloFullNameRequestDto implements HelloFullNameRequest, Serializable {	
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
}
