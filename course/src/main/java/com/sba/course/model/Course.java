package com.sba.course.model;

import lombok.Data;

import java.util.Date;

@Data
public class Course {

  private Integer id;
  private String name;
  private String description;
  private String skill;
  private Date startDate;
  private Date endDate;
  private String mentorName;
  private Float fee;
  private String status;
  private Integer progress;
  private String userName;

}
