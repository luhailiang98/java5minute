package com.qingguatang.Java5minute.course3.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 功能描述: SongInfo实体类
 *
 * @param:
 * @return:
 * @auther: luhailiang
 * @date: 2018/7/18 22:05
 */

@Getter
@Setter
@Builder
public class SongInfo {

  private String id;
  //歌曲名称
  private String name;
  //歌手名称
  private String singer;
  //专辑名称
  private String albumName;
  //评论数
  private int commentCount;
  //歌词
  private String lyrics;
  //专辑图片
  private String albumImage;
}
