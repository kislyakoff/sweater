package by.kislyakoff.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Message {
	@Id // tells to FW that private Integer id; will be a primary key
	  @GeneratedValue(strategy=GenerationType.AUTO) // tell to FW how to generate id
	  private Integer id;
	
	private String text;
	private String tag;
	
	
	public Message() { // empty constructor obligatory! if we have @Entity annotation we must use this one
	}
	
	public Message(String text, String tag) { // Shortcut for generate constructor Alt+Shift+S, O
		this.text = text;
		this.tag = tag;
	}
	public String getText() { // Shortcut for generate constructor Alt+Shift+S, O
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
