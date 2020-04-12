package sample.api.facebook;

import lombok.Data;

import java.util.Date;

@Data
public class Post {

	private String id;
	private Date created_time;
	private String message;
	private String full_picture;
	private String caption;
	
}
