package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer like;

	private List<Comment> comments = new ArrayList<Comment>();

	public Post() {
	}

	public Post(Date moment, String title, String content, Integer like) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public List<Comment> getComments() {
		return comments;
	}

	// Coleção não usa Setter. Usar add() e remove()
	public void addComments(Comment comment) {
		comments.add(comment);
	}

	public void removeComments(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		// String Build
		StringBuilder sb = new StringBuilder();
		// append(...) permite acrescentar no final
		sb.append(title + "\n");
		sb.append(like + " Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}

}
