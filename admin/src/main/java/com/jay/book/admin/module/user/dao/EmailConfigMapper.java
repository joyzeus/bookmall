package com.jay.book.admin.module.user.dao;

import com.jay.book.admin.module.user.entity.EmailConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmailConfigMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insertSelective(EmailConfig record);

    EmailConfig selectByPrimaryKey(Integer tableId);

    int updateByPrimaryKeySelective(EmailConfig record);

    List<EmailConfig> get(EmailConfig emailConfig);

    Integer resetSendEmailAccount(Integer tableId);
}