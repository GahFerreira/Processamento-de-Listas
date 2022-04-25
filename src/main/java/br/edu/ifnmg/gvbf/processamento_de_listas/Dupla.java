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

/**
 * @version 1.0
 * @author GahFerreira
 * @param <T> Primeiro elemento da Dupla, cujo tipo é T
 * @param <U> Segundo elemento da Dupla, cujo tipo é U
 */
public class Dupla<T, U> 
{
    private T primeiro;
    private U segundo;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Dupla() {}

    public Dupla(T primeiro, U segundo) 
    {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public T getPrimeiro() 
    {
        return primeiro;
    }

    public void setPrimeiro(T primeiro) 
    {
        this.primeiro = primeiro;
    }

    public U getSegundo() 
    {
        return segundo;
    }

    public void setSegundo(U segundo) 
    {
        this.segundo = segundo;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() 
    {
        return "{" + primeiro.toString() + ", " + segundo.toString() + '}';
    }
//</editor-fold>
}
