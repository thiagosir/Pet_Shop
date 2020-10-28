package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.unijuazeiro.PetShop.model.Cliente;

public class AdicionarCliente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Adicionar Criente
        Cliente c = new Cliente();
        c.setNome("André");
        c.setCpf("12421512512");
        em.persist(c);
        em.getTransaction().commit();

        em.close();

        emf.close();
    }   
}