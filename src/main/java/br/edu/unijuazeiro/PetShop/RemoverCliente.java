package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.PetShop.model.Cliente;

public class RemoverCliente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Cliente c = em.find(Cliente.class, 2);
        System.out.println("Nome " + c.getNome());

        em.remove(c);
        em.getTransaction().commit();

        em.close();

        emf.close();
    }
}