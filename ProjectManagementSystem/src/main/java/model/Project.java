package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "ProjectInformation")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
//    @Column(name="startDate")
//    private Date startDate;
//    @Column(name="endDate")
//    private Date endDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	public Date getStartDate() {
//		return startDate;
//	}
//	public void setStartDate(Date startDate) {
//		this.startDate = startDate;
//	}
//	public Date getEndDate() {
//		return endDate;
//	}
//	public void setEndDate(Date endDate) {
//		this.endDate = endDate;
//	}
	//@Override
//	public String toString() {
//		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
//				+ ", endDate=" + endDate + "]";
//	}
	public Project(String name, String description) {
		super();
		this.name = name;
		this.description = description;
//		this.startDate = startDate;
//		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}   
}
