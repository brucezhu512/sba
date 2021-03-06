package com.sba.course.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserCourse {

  private Integer id;
  private String skill;
  private String name;
  private String description;
  private Date startDate;
  private Date endDate;
  private String mentorName;
  private Float fee;
  private Float cost;
  private String status;
  private Integer duration;
  private Integer schedule;

}
