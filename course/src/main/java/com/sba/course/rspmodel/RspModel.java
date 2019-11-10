package com.sba.course.rspmodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(description = "Response Model")
public class RspModel {
  @ApiModelProperty(notes = "Response Code", example = "200", required = true, dataType = "java.lang.Integer")
  @NotNull
  private Integer code;

  @ApiModelProperty(notes = "Response Message", example = "Ok", required = true, dataType = "java.lang.String")
  @NotNull
  private String message;

  @ApiModelProperty(notes = "Response Data", required = true, dataType = "java.lang.Object")
  private Object data;

}
