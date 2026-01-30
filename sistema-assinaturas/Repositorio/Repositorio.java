package Exercicio02.Repositorio;

import java.util.List;

public interface Repositorio<T, ID> {

    void salvar(T entidade);

    T buscarPorId(ID id);

    List<T> buscarTodos();

    void remover(ID Id);
}
