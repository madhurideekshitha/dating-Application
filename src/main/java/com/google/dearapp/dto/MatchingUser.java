package com.google.dearapp.dto;//DTO-->Data Transfer Object

import java.util.List;

import com.google.dearapp.util.UserGender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MatchingUser {
	private String name;
	private Integer age;
	private UserGender gender;
	private List<String> interest;
	private int ageDifference; 
	private int matchingInterestCount;

}
