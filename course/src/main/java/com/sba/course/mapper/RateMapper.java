package com.sba.course.mapper;

import com.sba.course.model.Rate;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Service;

@Mapper
@Service
public interface RateMapper {

  @Insert("insert into sba_course.rate(courseId,rating) values(#{courseId},#{rating})")
  @SelectKey(statement = "select LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
  void addRate(Rate rate);
}
