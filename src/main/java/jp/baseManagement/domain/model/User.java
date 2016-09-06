package jp.baseManagement.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 3111266 on 2016/09/06.
 * jp.baseManagement.domain.model
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "PASSWORD")
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userID;

}
