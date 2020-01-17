#language: pt

Funcionalidade: Calculadora de triângulos
  Como um usuário do sistema Quero informar o tamanho dos lados de um triângulo Para conhecer o tipo do triângulo

  Esquema do Cenário: Consultando o tipo de um triângulo
    Dado que eu desejo verificar o tipo de um triângulo
    Quando eu informo o <valor_a> para o lado A
		E informo o <valor_b> para o lado B
		E informo o <valor_c> para o lado C
		E consulto o tipo do triângulo
    Então o sistema informa que o triângulo é <tipo_triangulo>

    Exemplos: 
			| valor_a | valor_b | valor_c | tipo_triangulo          |
      | 4       | 4       | 4       | Triângulo Equilátero    |
      | 5       | 8       | 3       | Triângulo Escaleno      |
      | 6       | 6       | 2       | Triângulo Isósceles     |
      | 6       | 9       | 0       | Triângulo Inválido      |
      |         | 6       | 2       | Preencha todos os lados |
