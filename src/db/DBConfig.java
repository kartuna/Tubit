/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.Serializable;

/**
 * DB configuration class.
 * stores properties to connect to mySQL database.
 * implements Serializable for storing and reading from .ser file as an object.
 */
public class DBConfig implements Serializable {
    private String jdbcDriver;
    private String dbUrl;
    private String user;
    private String password;
    
    /**
     * Simple c-tor.
     * @param drv
     * @param url
     * @param usr
     * @param pass 
     */
    public DBConfig(String drv, String url, String usr, String pass) {
        this.jdbcDriver = drv;
        this.dbUrl = url;
        this.user = usr;
        this.password = pass;
    }
    
    /**
     * jdbcDriver getter.
     * @return 
     */
    public String getJdbcDriver() {
        return this.jdbcDriver;
    }
    
    /**
     * jdbcDriver setter.
     * @param drv 
     */
    public void setJdbcDriver(String drv) {
        this.jdbcDriver = drv;
    }
    
    /**
     * dbUrl getter.
     * @return 
     */
    public String getDBUrl() {
        return this.dbUrl;
    }
    
    /**
     * dbUrl setter.
     * @param url 
     */
    public void setDBUrl(String url) {
        this.dbUrl = url;
    }
    
    /**
     * user getter.
     * @return 
     */
    public String getUser() {
        return this.user;
    }
    
    /**
     * user setter.
     * @param usr 
     */
    public void setUser(String usr) {
        this.user = usr;
    }
    
    /**
     * password getter.
     * @return 
     */
    public String getPassword() {
        return this.password;
    }
    
    /**
     * password setter.
     * @param pass 
     */
    public void setPassword(String pass) {
        this.password = pass;
    }
}