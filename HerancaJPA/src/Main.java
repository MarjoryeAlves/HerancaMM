public class Main {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setId(1l);
		a.setNome("Fulano");
		DAO<Aluno> d = new DAO<Aluno>();
		d.save(a);
		
//		Academico a = new Academico();
//		try {
//			a.cadastrarALuno(null, null, null);
//		} catch (CPFInvalidoException e) {
//			e.printStackTrace();
//		}
//		DAO<Professor> dao = new DAO<Professor>();
//		Professor p = new Professor();
//		p.setId(26l);
//		p.setNome("HugoFF");
//		dao.save(p);
//		Professor p2 = new Professor();
//		p2.setId(28l);
//		p2.setNome("Hugo");
//		dao.save(p2);
//		Professor find = dao.find(Professor.class, 28l);
//		System.out.println(find.getNome());
	}
	
}
