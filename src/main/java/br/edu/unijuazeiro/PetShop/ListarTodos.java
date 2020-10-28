package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.PetShop.model.Cliente;

public final class ListarTodos {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.createQuery("from Cliente", Cliente.class).getResultList().forEach(o -> {
        System.out.println("Id: " + o.getCodigo()); 
        System.out.println("Nome: " + o.getNome());
        System.out.println("Cpf: " + o.getCpf());
        });

        
        em.close();
       
    }   
}