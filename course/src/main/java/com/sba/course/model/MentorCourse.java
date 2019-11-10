package com.sba.course.model;

import lombok.Data;

import java.util.Date;

@Data
public class MentorCourse {

  private Integer id;
  private String name;
  private String mentorName;
  private String skill;
  private Date startDate;
  private Date endDate;
  private Float fee;
  private Integer rate;
  private String description;
  private Integer duration;

}
