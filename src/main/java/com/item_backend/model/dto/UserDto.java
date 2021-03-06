package com.item_backend.model.dto;

import com.item_backend.mapper.UserTypeMapper;
import com.item_backend.model.entity.User;
import com.item_backend.model.entity.UserType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description:
 * @Author: Mt.Li
 * @Create: 2020-05-12 16:20
 */
@Data
@ToString
public class UserDto implements Serializable {


    private static final long serialVersionUID = -7388350950752987171L;

    private User user;

    private UserType userType;
}
