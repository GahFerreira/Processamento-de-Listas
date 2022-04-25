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
 * @version 1.0
 * @author GahFerreira
 */
public class Program 
{
    public static void main(String[] args) 
    {                
        Double in[] = {2.900000095, 6.699999809, 4.900000095, 7.900000095, 9.800000191, 6.900000095, 6.099999905, 6.199999809, 6.0, 5.099999905, 4.699999809, 4.400000095, 5.800000191};
        Double out[] = {4.0, 7.400000095, 5.0, 7.199999809, 7.900000095, 6.099999905, 6.0, 5.800000191, 5.199999809, 4.199999809, 4.0, 4.400000095, 5.199999809};
        
        List<Double> ins = new ArrayList<>( Arrays.asList(in) );
        List<Double> outs = new ArrayList<>( Arrays.asList(out) );
        
        Dupla<Double, Double> resposta = ProcessadorListas.processarListas(ins, outs);
        System.out.println(resposta);
        System.out.printf("%.3f %.3f\n", resposta.getPrimeiro(), resposta.getSegundo());
    }
}
