package soyunkim.todolist;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Now {
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	private OffsetDateTime time;
	
	public Now() {
		this.time = OffsetDateTime.now();		
	}
	
	public OffsetDateTime getTime() {
		return this.time;
	}

}
