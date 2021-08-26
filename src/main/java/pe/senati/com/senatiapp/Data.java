/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.senati.com.senatiapp;

import javax.ejb.Stateless;

/**
 *
 * @author User
 */
@Stateless
public class Data {
    private String fullname, cargo, contrato;
    private Double sueldoB, bono, comision, sueldBruto, descuento, sueldoNeto;

    public Data() {
    }

    public String getFullname() {
        if(isValidFullName()){
            return fullname;
        }
        return "raro";
        
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    private boolean isValidFullName(){
        String a= this.fullname.trim().toLowerCase();
        return a!=null && !(a.isEmpty()||a.equals("elza patito"));
    }
    
    public Double getSueldoB() {
        if(isValidSueldoB()){return sueldoB;}
        return 0.0;
    }
       
    public void setSueldoB(String sueldoB) {
        this.sueldoB = Double.valueOf(sueldoB);
    }

    private boolean isValidSueldoB(){
        return this.sueldoB>930.00 && this.sueldoB<999999.00;
    } 
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    private boolean isValidCargo(){
        String a =this.cargo;
        return a.equals("jefe")||a.equals("admin")||a.equals("operario");
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
    private void calculoBeneficios(){
        switch (this.cargo){
            case "jefe":
                this.bono=200.0;
                this.comision=75.0;
                break;
            case  "admin":
                this.bono=150.0;
                this.comision=50.0;
                break;               
            default:
                this.bono=130.0;
                this.comision=50.0;
                break;
        }
     
    }

    public Double getBono() {
        calculoBeneficios();
        return bono;
    }

    public Double getComision() {
        calculoBeneficios();
        return comision;
    }
    
    public Double getSueldBruto(){
        this.sueldBruto = this.bono+this.comision+this.sueldoB;
        return sueldBruto;
    }
    
    public Double getDescuento(){
        this.descuento=0.0;
        if(this.contrato.equals("planilla")){
            this.descuento=0.13*this.sueldBruto;
        }else{
            if(this.sueldBruto>1800.0){
                this.descuento=0.08*this.sueldBruto; 
           }
        }      
        return this.descuento;
    }
    
    public Double getSueldoNeto(){
        this.sueldoNeto=this.sueldBruto-this.descuento;
        return this.sueldoNeto;
    }
        

}
