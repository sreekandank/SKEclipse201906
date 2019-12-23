package sk.spring.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="USER_TAB")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "User")
public class User implements Serializable
{
    private static final long serialVersionUID = -1232395859408322328L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="ID")
    private long id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="USERID")
    private String userid;

    @Column(name="password")
    private String password;
    
    @Column(name="phone")
    private long phone;
    public User()
    {
        super();
    }
    
    public User(long id, String name, String userid, String password, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.userid = userid;
		this.password = password;
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + ", userid=" + userid + ", password="+
    password+", phone="+ phone +"]";
    }
}