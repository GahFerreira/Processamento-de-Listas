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

/**
 * @version 1.0
 * @author GahFerreira
 */
public class ProcessadorListas 
{
    public static Dupla<Double, Double> processarListas(List<Double> ins, List<Double> outs)
    {
        return processarListas(ins, outs, 2000, 0.025);
    }
    
    public static Dupla<Double, Double> processarListas(List<Double> ins, List<Double> outs, Integer e)
    {
        return processarListas(ins, outs, e, 0.025);
    }
    
    public static Dupla<Double, Double> processarListas(List<Double> ins, List<Double> outs, Integer e, Double lr)
    {
        Double w0, w1, p, dif;
        int tamanho_listas;
        
        w0 = 0.0;
        w1 = 0.0;
        tamanho_listas = ins.size();
        
        for (int i = 1; i <= e; i++)
        {
            for(int i_lista = 0; i_lista < tamanho_listas; i_lista++)
            {
                p = w1 * ins.get(i_lista) + w0;
                dif = outs.get(i_lista) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(i_lista);
            }
            
            if (i % 10 == 0) System.out.println(i + "/" + w1 + "/" + w0);
        }
        
        return new Dupla<> (w1, w0);
    }
}
