package com.twy.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public class Role implements Serializable {
    private String roleId;

    private String roleName;

    private List<Promise> promises;

    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", promises=" + promises +
                ", users=" + users +
                '}';
    }

    public List<Promise> getPromises() {
        return promises;
    }

    public void setPromises(List<Promise> promises) {
        this.promises = promises;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}
