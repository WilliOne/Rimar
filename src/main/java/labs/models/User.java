package labs.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {

	@Id
	  @GeneratedValue
	  private Long id;
	
    @NotNull
    @Size(min=2, max=30)
    private String name;
    
    @NotNull
    @Size(min=2, max=30)
    private String famil;
    
    @NotNull
    @Column(unique = true)
    private String mail;
    
    @NotNull
    private String pass;

    public User() {}
    
    public User(String name, String famil, String mail, String pass) {
		super();
		this.name = name;
		this.famil = famil;
		this.mail = mail;
		this.pass = pass;
	}

    public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamil() {
		return famil;
	}

	public void setFamil(String famil) {
		this.famil = famil;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
    
    
}
