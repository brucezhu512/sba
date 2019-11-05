package com.sba.course.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="course")
@Data
public class Course {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "name")
  private String name;
  @Column(name = "description")
  private String description;
  @Column(name = "skill")
  private String skill;
  @Column(name = "start_date")
  private Date startDate;
  @Column(name = "end_date")
  private Date endDate;
  @Column(name = "mentor_name")
  private String mentorName;
  @Column(name = "progress")
  private Integer progress;
  @Column(name = "fee")
  private Float fee;
  @Column(name = "status")
  private String status;
  @Column(name = "user_name")
  private String userName;
}
