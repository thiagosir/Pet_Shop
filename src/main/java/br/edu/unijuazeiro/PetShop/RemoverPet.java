package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.PetShop.model.Animal;

public class RemoverPet {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Animal a = em.find(Animal.class, 2);
        System.out.println("Nome " + a.getNome());
        em.remove(a);

        em.getTransaction().commit();

        em.close();

        emf.close();
    }
}