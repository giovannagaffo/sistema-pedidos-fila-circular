# sistema-pedidos-fila-circular
Simulação de um sistema de pedidos de pizzaria em Java. Utiliza uma Fila Circular (Circular Queue) para gerenciar o fluxo de atendimento de forma eficiente, otimizando o uso de memória. O sistema garante que os pedidos sejam atendidos na ordem exata em que foram realizados (FIFO - *First-In, First-Out*).

Diferente de uma fila linear em array, a **Fila Circular** utiliza o operador de módulo (`%`) para "dar a volta" no array quando o final é atingido.
O sistema simula a chegada de pedidos (ex: 101, 102, 103) e o atendimento automático, liberando espaço para novas solicitações conforme a cozinha finaliza as pizzas.
Dessa forma, há a reutilização de memória, uma vez que as posições liberadas no início do array podem ser ocupadas novamente sem a necessidade de mover todos os elementos. 


- **Enfileirar (Enqueue):** Adiciona um novo número de pedido à fila de produção.
- **Desenfileirar (Dequeue):** Remove e retorna o pedido que está no topo da fila (o próximo a ser entregue).
- **Verificação de Estado:** Métodos para checar se a fila de produção está cheia ou vazia.
- **Impressão de Status:** Visualização dos pedidos pendentes na ordem correta de atendimento.
