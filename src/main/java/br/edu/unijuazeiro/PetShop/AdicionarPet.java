package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.PetShop.model.Animal;
import br.edu.unijuazeiro.PetShop.model.Cliente;

public class AdicionarPet {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Adicionar Pet
        Cliente c = em.find(Cliente.class, 1);
        Animal a = new Animal();
        a.setCliente(c);
        a.setNome("Belinha");
        a.setRaca("poodle");

        em.persist(a);
        em.getTransaction().commit();

        em.close();

        emf.close();
    }   
}