package Exercicio02.Repositorio;

import Exercicio02.Entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio implements Repositorio<Cliente, Integer> {

    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void salvar(Cliente cliente){
        clientes.add(cliente);
    }

    @Override
    public Cliente buscarPorId(Integer id){
        for(Cliente a : clientes){
            if (a.getId().equals(id))
                return a;
        }
        return null;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clientes;
    }

    @Override
    public void remover(Integer id) {
        clientes.removeIf(a -> a.getId().equals(id));
    }
}
