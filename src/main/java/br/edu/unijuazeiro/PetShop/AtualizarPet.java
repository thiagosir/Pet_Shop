package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.PetShop.model.Animal;


public class AtualizarPet {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Atualizar Pet (nome e raça)
        Animal a = em.find(Animal.class, 3);
        System.out.println("Nome " + a.getNome() + "Raça " + a.getRaca());

        a.setNome("Xurastei");
        a.setRaca("Furão");

        em.merge(a);

        em.getTransaction().commit();

        em.close();

        emf.close();
    }
}