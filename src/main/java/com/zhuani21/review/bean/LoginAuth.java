package com.zhuani21.review.bean;

public class LoginAuth {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_auth.id
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_auth.user_id
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_auth.username
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_auth.password
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_auth.status
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    private Boolean status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_auth.id
     *
     * @return the value of login_auth.id
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_auth.id
     *
     * @param id the value for login_auth.id
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_auth.user_id
     *
     * @return the value of login_auth.user_id
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_auth.user_id
     *
     * @param userId the value for login_auth.user_id
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_auth.username
     *
     * @return the value of login_auth.username
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_auth.username
     *
     * @param username the value for login_auth.username
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_auth.password
     *
     * @return the value of login_auth.password
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_auth.password
     *
     * @param password the value for login_auth.password
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_auth.status
     *
     * @return the value of login_auth.status
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_auth.status
     *
     * @param status the value for login_auth.status
     *
     * @mbggenerated Tue Jan 12 17:37:37 CST 2016
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}