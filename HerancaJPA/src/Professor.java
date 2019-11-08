import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor implements Identificavel{

	@Id
	private Long id;
	private String curso;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
	
	