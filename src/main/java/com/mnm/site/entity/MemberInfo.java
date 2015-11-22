package com.mnm.site.entity;
 
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="member_info")
public class MemberInfo implements Serializable {
	private static final long serialVersionUID = -8046001056172441612L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "m_id")
    private int id;
    
    @Column(name = "m_user_id")
    private String userId;
 
    @Column(name = "m_user_name")
    private String userName;

    @Column(name = "m_nickname")
    private String nickName;
    
    @Column(name = "m_password")
    private String pwd;

    @Column(name = "m_status")
    private int status;    

    @Column(name = "m_birthday")
    private Date birth;

    @Column(name = "m_gender")
    private int gender;    
    
    @Column(name = "m_occtime")
    private Date occTime;    

    @Column(name = "m_email")
    private String email;
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getOccTime() {
		return occTime;
	}

	public void setOccTime(Date occTime) {
		this.occTime = occTime;
	}    
    
}

