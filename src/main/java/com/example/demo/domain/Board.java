package com.example.demo.domain;

import java.time.*;
import java.util.*;

import lombok.*;

@Data
public class Board {
	private Integer id;
	private String title;
	private String body;
	private LocalDateTime inserted;
	private String writer;
	
	private Integer fileCount;
	
	private List<String> fileName;
}



