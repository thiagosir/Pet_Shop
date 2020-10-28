package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.PetShop.model.Animal;


public class ListarPet {

    public static void main(String[] args) {
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Animal a = em.find(Animal.class, 3);
        System.out.println("Codigo " + a.getCodigo());
        System.out.println("Nome " + a.getNome());
        System.out.println("Raça: " + a.getRaca());

        em.close();
        emf.close();

    }
}
