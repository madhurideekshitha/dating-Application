package com.google.dearapp.responsestructure;

import java.util.List;

import com.google.dearapp.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStructure<T> {
	private int status;
	private String message;
	private T body;

}
