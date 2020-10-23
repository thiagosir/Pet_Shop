package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.PetShop.model.Animal;
import br.edu.unijuazeiro.PetShop.model.Cliente;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // INSERT
        Cliente c = new Cliente( 1, "Thiago Bento", "13819936483");
        Animal a = new Animal(1, "Kaio", "Comunista");
        c.setAnimais(a);
        em.persist(c);
        em.getTransaction().commit();

        em.close();

        emf.close();
    }
}
