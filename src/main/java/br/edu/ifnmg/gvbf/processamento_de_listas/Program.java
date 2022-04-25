/*
 * The MIT License
 *
 * Copyright 2022 GahFerreira.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.edu.ifnmg.gvbf.processamento_de_listas;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe para executar o processamento de listas de Double pela classe ProcessadorListas
 * 
 * @version 1.0
 * @author GahFerreira
 */
public class Program 
{
    public static void main(String[] args) 
    {   
        // 'in' e 'out' são as listas de entrada
        // Elas devem ter o mesmo tamanho e ser compostas apenas por elementos Double
        // Os valores atuais de 'in' e 'out' são apenas exemplo para testes
        Double in[] = {2.900000095, 6.699999809, 4.900000095, 7.900000095, 9.800000191, 6.900000095, 6.099999905, 6.199999809, 6.0, 5.099999905, 4.699999809, 4.400000095, 5.800000191};
        Double out[] = {4.0, 7.400000095, 5.0, 7.199999809, 7.900000095, 6.099999905, 6.0, 5.800000191, 5.199999809, 4.199999809, 4.0, 4.400000095, 5.199999809};
        
        List<Double> ins = new ArrayList<>( Arrays.asList(in) );
        List<Double> outs = new ArrayList<>( Arrays.asList(out) );
        
        // O processamento gera uma linha de saída com valores provisórios da Dupla resultante ...
        // ... a cada 10 iterações do for externo
        Dupla<Double, Double> resposta = ProcessadorListas.processarListas(ins, outs);
        
        // Na saída temos a Dupla resultante com cada elemento limitado a 3 casas decimais
        // Para a entrada exemplo atual, a saída esperada na segunda linha é: '0,506 2,215'
        System.out.printf("%.3f %.3f\n", resposta.getPrimeiro(), resposta.getSegundo());
    }
}
