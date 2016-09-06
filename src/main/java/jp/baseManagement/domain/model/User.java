package jp.baseManagement.domain.model;

import lombok.Data;

import java.io.Serializable;


/**
 * Created by 3111266 on 2016/09/06.
 * jp.baseManagement.domain.model
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String password;

    private String userID;

}
