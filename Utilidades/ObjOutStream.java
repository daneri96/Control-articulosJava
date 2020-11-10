/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author danie
 */
public class ObjOutStream extends ObjectOutputStream {
    
    public ObjOutStream(OutputStream out) throws IOException{
        super(out);
    }
    
    protected ObjOutStream() throws IOException, SecurityException
    {
        super();
    }
    
    protected void writeStreamReader() throws IOException
    {
        
    }
    
}
