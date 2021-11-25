package com.twy.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public class Promise implements Serializable {
    private String promiseId;

    private String promiseName;

    private List<Role> roles;

    @Override
    public String toString() {
        return "Promise{" +
                "promiseId='" + promiseId + '\'' +
                ", promiseName='" + promiseName + '\'' +
                ", roles=" + roles +
                '}';
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getPromiseId() {
        return promiseId;
    }

    public void setPromiseId(String promiseId) {
        this.promiseId = promiseId == null ? null : promiseId.trim();
    }

    public String getPromiseName() {
        return promiseName;
    }

    public void setPromiseName(String promiseName) {
        this.promiseName = promiseName == null ? null : promiseName.trim();
    }
}