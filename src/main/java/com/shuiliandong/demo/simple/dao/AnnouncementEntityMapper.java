package com.shuiliandong.demo.simple.dao;

import com.shuiliandong.demo.simple.entity.AnnouncementEntity;

public interface AnnouncementEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbggenerated
     */
    int insert(AnnouncementEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbggenerated
     */
    int insertSelective(AnnouncementEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbggenerated
     */
    AnnouncementEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AnnouncementEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(AnnouncementEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AnnouncementEntity record);
}