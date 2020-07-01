package com.estudos.workshopmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.estudos.workshopmongo.dto.AuthorDTO;
import com.estudos.workshopmongo.dto.CommentDTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Post", description = "Post Table Entity")
@Document(collection = "post")
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "Post ID")
	@Id
	private String id;
	
	@ApiModelProperty(value = "Post Date")
	private Date date;
	
	@ApiModelProperty(value = "Post Title")
	@NotNull(message = "the title cannot be null")
	@NotEmpty(message = "the title cannot be empty")
	private String title;
	
	@ApiModelProperty(value = "Post body")
	@NotNull(message = "the body cannot be null")
	@NotEmpty(message = "the body cannot be empty")
	private String body;
	
	@ApiModelProperty(value = "Post Author")
	private AuthorDTO author;
	
	@ApiModelProperty(value = "Post comments")
	private List<CommentDTO> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(String id, Date date, String title, String body, AuthorDTO author) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.author = author;
	}
	
	public Post(String id, Date date, String title, String body, AuthorDTO author, List<CommentDTO> comments) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.author = author;
		this.comments = comments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

	public List<CommentDTO> getComments() {
		return comments;
	}

	public void setComments(List<CommentDTO> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	} 
		
}
