
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.beans.ProfessorEntidade;
import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.model.validator.AlunoValidator;
import org.fpij.jitakyoei.util.DatabaseManager;
import org.fpij.jitakyoei.view.MainAppView;
import org.fpij.jitakyoei.view.gui.MainAppFrame;
import org.junit.Test;
import org.junit.BeforeClass;



public class AppFacadeTeste {
    //	private static DAO<Aluno> alunoDao;
	private static Aluno aluno;
	private static Entidade entidade;
	private static Endereco endereco;
	private static Filiado filiadoAluno;
	private static Filiado filiadoProf;
	private static Professor professor;
    private static AppFacadeImpl appFacade;
    private static MainAppView appView;
    private static ProfessorEntidade relacionamentos;


    @BeforeClass
	public static void setUp(){
		DatabaseManager.setEnviroment(DatabaseManager.TEST);
		filiadoAluno = new Filiado();
		filiadoAluno.setNome("Aécio");
		filiadoAluno.setCpf("036.464.453-27");
		filiadoAluno.setDataNascimento(new Date());
		filiadoAluno.setDataCadastro(new Date());
		filiadoAluno.setId(1332L);
		filiadoAluno.setRg(new Rg("5026762-0", "SSP-PI"));
		
		endereco = new Endereco();
		endereco.setBairro("Dirceu");
		endereco.setCep("64078-213");
		endereco.setCidade("Teresina");
		endereco.setEstado("PI");
		endereco.setRua("Rua Des. Berilo Mota");
		
		filiadoProf = new Filiado();
		filiadoProf.setNome("Professor");
		filiadoProf.setCpf("036.464.453-27");
		filiadoProf.setDataNascimento(new Date());
		filiadoProf.setDataCadastro(new Date());
		filiadoProf.setId(3332L);
		filiadoProf.setEndereco(endereco);
		
		professor = new Professor();
		professor.setFiliado(filiadoProf);
		
		entidade = new Entidade();
		entidade.setEndereco(endereco);
		entidade.setNome("Academia 1");
		entidade.setTelefone1("(086)1234-5432");
		
		aluno = new Aluno();
		aluno.setFiliado(filiadoAluno);
		aluno.setProfessor(professor);
		aluno.setEntidade(entidade);

        appView = new MainAppView();
		
        appFacade = new AppFacadeImpl(appView);

//		alunoDao = new DAOImpl<Aluno>(Aluno.class);
	}

    @Test
    public void createAlunoTest()
    {

        try {
            appFacade.createAluno(aluno);
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao cadastrar o aluno!"
            + " Verifique se todos os dados foram preenchidos corretamente.", e);
        }
    }

    @Test
    public void updateAlunoTest()

    {
        try {
            appFacade.updateAluno(aluno);
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao salvar os dados do aluno."
				+ " Verifique se todos os dados foram preenchidos corretamente!", e);
        }
    }


    @Test
    public void searchAlunoTest()
    {
        try {
            appFacade.searchAluno(aluno);
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao salvar os dados do aluno."
            + " Verifique se todos os dados foram preenchidos corretamente!", e);
        }
    }

    @Test
    public void listAlunosTest()

    {
        try {
            appFacade.listAlunos();
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao obter a lista de alunos."
            + " Verifique se todos os dados foram preenchidos corretamente!", e);
        }
    }


    @Test
    public void createEntidadeTest()

    {
        try {
            appFacade.createEntidade(entidade);
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao cadastrar a entidade!"
            + " Verifique se todos os dados foram preenchidos corretamente.", e);
        }
    }

    @Test
    public void updateEntidadeTest()

    {
        try {
            appFacade.updateEntidade(entidade);
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao atualizar a entidade!"
            + " Verifique se todos os dados foram preenchidos corretamente.", e);
        }
    }

    @Test
    public void listEntidadeTest()

    {
        try {
            appFacade.listEntidade();
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao listar entidades!"
            + " Verifique se todos os dados foram preenchidos corretamente.", e);
        }
    }
    
    @Test
    public void searchEntidadeTest()
    {
        try {
            appFacade.searchEntidade(entidade);
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao buscar entidades!"
            + " Verifique se todos os dados foram preenchidos corretamente.", e);
        }
    }


    @Test
    public void createProfessorTest()

    {
        try {
            appFacade.createProfessor(professor);
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao cadastrar o professor!"
            + " Verifique se todos os dados foram preenchidos corretamente.", e);
        }
    }

    @Test
    public void updateProfessorTest()

    {
        try {
            appFacade.updateProfessor(professor);
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao atualizar os dados do professor!"
            + " Verifique se todos os dados foram preenchidos corretamente.", e);
        }
    }

    @Test
    public void listProfessorTest()

    {
        try {
            appFacade.listProfessores();
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao listar de professores."
            + " Verifique se todos os dados foram preenchidos corretamente!", e);
        }
    }
    
    @Test
    public void searchProfessorTest()
    {
        try {
            appFacade.listProfessores();
        } catch (Exception e) {
            assertEquals("Ocorreu um erro ao buscar os professores."
            + " Verifique se todos os dados foram preenchidos corretamente!", e);
        }
    }
}
