package br.edu.unijuazeiro.PetShop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.unijuazeiro.PetShop.model.Cliente;

public class ListarCliente {

    public static void main(String[] args) {
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Cliente c = em.find(Cliente.class, 1);
        System.out.println("Codigo " + c.getCodigo());
        System.out.println("Nome " + c.getNome());
        System.out.println("Cpf: " + c.getCpf());

        em.close();

    }
}
