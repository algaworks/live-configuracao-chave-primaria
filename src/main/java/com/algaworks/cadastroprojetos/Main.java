package com.algaworks.cadastroprojetos;

import com.algaworks.cadastroprojetos.model.Alocacao;
import com.algaworks.cadastroprojetos.model.AlocacaoId;
import com.algaworks.cadastroprojetos.model.Funcionario;
import com.algaworks.cadastroprojetos.model.Projeto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("Projetos-PU");
        EntityManager entityManager = factory.createEntityManager();

        Projeto projeto = new Projeto();
        projeto.setNome("Projeto Vendas 2020");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João da Silva");

        entityManager.getTransaction().begin();
        entityManager.persist(projeto);
        entityManager.persist(funcionario);

        entityManager.flush();

        Alocacao alocacao = new Alocacao();
        alocacao.setId(new AlocacaoId());
        alocacao.setFuncionario(funcionario);
        alocacao.setProjeto(projeto);

        entityManager.persist(alocacao);
        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}
