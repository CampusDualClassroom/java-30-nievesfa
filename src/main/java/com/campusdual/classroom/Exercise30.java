package com.campusdual.classroom;


public class Exercise30 {

    public static int divisionWithCustomException(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0){
            throw new DivisionByZeroException("Non se pode dividir un número entre 0");
        }else{
            return  dividendo / divisor;
        }

    }

    public static void main(String[] args) {
        Exercise30 p = new Exercise30();
        try {
            System.out.println(p.divisionWithCustomException(10, 0));
        }catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Programa acabado");
    }
}
