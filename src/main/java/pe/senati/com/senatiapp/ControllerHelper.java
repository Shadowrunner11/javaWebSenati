/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.senati.com.senatiapp;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class ControllerHelper extends BaseHelper{
    protected Data datos;
    public ControllerHelper(HttpServlet servlet,
    HttpServletRequest request,
    HttpServletResponse response) {
    super(servlet, request, response);
    datos= new Data();

    }

    public Data getDatos() {
        return datos;
    }

    public void setDatos(Data datos) {
        this.datos = datos;
    }
    
    public void doGet(){
        try{
           String adress;
           try{
           request.getSession().setAttribute("ayudante", this);
           datos.setFullname(request.getParameter("fullname"));
           datos.setSueldoB(request.getParameter("sueldoB"));
           datos.setCargo(request.getParameter("cargo"));
           datos.setContrato(request.getParameter("contrato"));
            
           
           if(request.getParameter("evaluador")!=null && datos.getSueldoB()!=0 && !"raro".equals(datos.getFullname())){
               adress="Reporte.jsp";
           }else if (request.getParameter("editar")!=null){
               adress="index.jsp";
           }else if (request.getParameter("confirmar")!=null){
               System.out.println("confrimar");
               adress="Confirm.jsp";
           }
           else{
               adress="index.jsp";
           }
           }catch (Exception e){
               adress="index.jsp";
           }
           RequestDispatcher despachador = request.getRequestDispatcher(adress);
           despachador.forward(request, response);
        
        }catch(Exception e){
            System.out.println(e);
        }

    }
    
}
