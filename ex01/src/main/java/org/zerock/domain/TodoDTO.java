package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	
	private String title;
	
	// 문자열로 yyyy/MM/d 형식이 맞다면 자동으로 날짜 타입으로 변환
	// @InitBinder 주석처리해야 작동
	@DateTimeFormat(pattern = "yyyy/MM/dd")  
	private Date dueDate;
	
}
