package com.qingguatang.Java5minute.course4.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Comment {

  private String id;
  //评论人头像
  private String icon;
  //评论人昵称
  private String nickName;
  //评论内容
  private String content;
  //评论时间
  private Date commentTime;
  //点赞数
  private int likeNum;


}
