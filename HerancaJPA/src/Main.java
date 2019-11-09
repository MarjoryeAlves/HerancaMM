public class Main {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.setId(1l);
		a.setNome("Fulano");
		DAO<Aluno> d = new DAO<Aluno>();
		d.save(a);
	}
		Pessoa p = new Pessoa();
		p.setId(10);
		p.setCpf(12);
		p.setNome("Fulano");
		p.setEmail("");
		DAO<Pessoa> d1 = new DAO<Pessoa>();
		d.save(p);
	}
		Tecnico t = new Tecnico();
		t.setId(13);
		t.setCurso("");
		DAO<Tecnico> d2 = new DAO<Tecnico>();
		d.save(t);
	}
		Professor prof = new Professor ();
		prof.setId(14);
		prof.setCurso("");
		DAO<Professor> d3 = new DAO<Professor>();
		d.save(prof);
	}