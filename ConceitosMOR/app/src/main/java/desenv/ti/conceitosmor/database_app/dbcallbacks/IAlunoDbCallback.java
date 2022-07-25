package desenv.ti.conceitosmor.database_app.dbcallbacks;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Aluno;

public interface IAlunoDbCallback {
    public void getAlunoFromDB(List<Aluno> tblAluno);
}
