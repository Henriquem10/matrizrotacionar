# matrizrotacionar

Exercicio em que rotaciona os valores das bordas de uma matriz quadrada.
Dentro do for em que muda os valores da matriz, é usado duas variaveis que armazenam os valores usados.
A temp salva o valor atual da posição da matriz, e a ant salva o valor da matriz antes dela ter sido alterada ao rotacionar.
Assim o codigo na maioria dos casos da matriz funciona da seguinte maneira:  temp armazena o valor que foi modificado da posicao -> a posicao atual é trocada pelo valor antes de ser alterado -> a proxima posicao é trocada pelo valor atual da matriz -> o valor atual da matriz é trocado de volta pelo valor de temp que é o valor alterado.

É feito dessa maneira para que não se perca os valores da matriz ao rotacionar os valores.
