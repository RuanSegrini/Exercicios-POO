package Repositorio;

import Entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio implements Repositorio<Cliente, Integer> {

    private List<Cliente> clientes = new ArrayList<>();

    
    @Override
    public void salvar(Cliente cliente){
        // Adiciona o CLIENTE na lista
        clientes.add(cliente);
    }
    // Método que busca um CLIENTE pelo ID
    @Override
    public Cliente buscarPorId(Integer id){
        // Percorre a lista de CLIENTES
        for(Cliente a : clientes){
            // Verifica se o ID do CLIENTE atual é igual ao ID procurado
            if (a.getId().equals(id))
                return a;
        }
        // Se não encontrar nenhum CLIENTE com esse ID, retorna null
        return null;
    }

    @Override
    public List<Cliente> buscarTodos() {
        // Retorna a lista inteira de CLIENTE
        return clientes;
    }

    @Override
    public void remover(Integer id) {
        // Remove da lista todo CLIENTE cujo ID seja igual ao informado
        clientes.removeIf(a -> a.getId().equals(id));
    }
}
