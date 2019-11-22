public class Main {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		DAO<Aluno> d = new DAO<Aluno>();
		DAO<Professor> prof = new DAO<Professor>();
		DAO<Tecnico> t = new DAO<Tecnico>();
		DAO<Pessoa> pe = new DAO<Pessoa>();
		
		for (int i = 0; i <3000 ; i++) {
			Aluno a = new Aluno();
			a.setNome("");
			a.setCpf(1212);
			a.setEmail("");
			
			d.save(a);
			
			Tecnico tec = new Tecnico();
			tec.setNome("");
			tec.setCpf(87463);
			tec.setCurso("");
			tec.setEmail("");
			
			t.save(tec);
			
			Professor pr = new Professor();
			pr.setNome("");
			pr.setCpf(546);
			pr.setEmail("");
			pr.setCurso("");
			
			prof.save(pr);
			
			Pessoa p = new Pessoa();
			p.setNome("");
			p.setEmail("");
			p.setCpf(9874);
			
			pe.save(p);
			
			long fim = System.currentTimeMillis();
			System.out.println(fim-inicio);
			
		}
		
			long inicio2 = System.currentTimeMillis();
		
			Pessoa algumnome = pe.find(Pessoa.class, 524l);
			Aluno outronome = d.find(Aluno.class, 77l);
			Professor outronome2 = prof.find(Professor.class, 3l);
			Tecnico outronome3 = t.find(Tecnico.class, 2l);
		
			long fim2 = System.currentTimeMillis();
			System.out.println(fim2-inicio2);
		
		
			long inicio3 = System.currentTimeMillis();
		
			pe.remove(algumnome);
			d.remove(outronome);
			prof.remove(outronome2);
			t.remove(outronome3);
		
			long fim3 = System.currentTimeMillis();
			System.out.println(fim3-inicio3);
		
		
		
	}
	
	
	}
	

		