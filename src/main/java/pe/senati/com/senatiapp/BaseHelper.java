/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.senati.com.senatiapp;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author User
 */
public class BaseHelper {
    protected final HttpServletRequest request;
    protected final HttpServletResponse response;
    protected final HttpServlet servlet;
    public BaseHelper(HttpServlet servlet,HttpServletRequest request,
                        HttpServletResponse response) {
            this.servlet = servlet;
            this.request = request;
            this.response = response;
    }       
}
