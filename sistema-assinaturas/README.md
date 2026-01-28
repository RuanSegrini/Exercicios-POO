# Exercício do dia 28/01/2026 – Sistema de Assinaturas de Streaming

## Objetivo
Criar um mini-sistema de assinatura de streaming usando:
- Java OO completo (classes, objetos, herança, polimorfismo, interfaces)
- Generics, Set e Map
- Enum
- Lambda, Method Reference e Stream API
- LocalDate
- Arquitetura em camadas (model, repository, main)

## Entidades
- `Cliente`: id, nome, dataCadastro
- `Plano`: id, nome (enum TipoPlano), valor
- `Assinatura<T>`: id, cliente, plano, serviços (Set<T>), dataInicio, dataFim
- Enum `TipoPlano`: BASIC, PREMIUM, VIP

## Repositórios
- Interface genérica `Repositorio<T, ID>` com métodos:
  - salvar(T entidade)
  - buscarPorId(ID id)
  - buscarTodos()
  - remover(ID id)
- Implementações para Cliente, Plano e Assinatura<T>

## Regras
- Uma assinatura não pode ter dataFim anterior à dataInicio
- Listar assinaturas ativas com Stream API
- Listar clientes com plano VIP usando lambda e method reference
- Map<Long, Cliente> para controle rápido
- Set<Plano> para evitar duplicatas
- Métodos estáticos para filtrar planos por tipo

## Teste
1. Criar 3 clientes, 3 planos e 2 assinaturas
2. Listar clientes VIP
3. Listar assinaturas ativas
