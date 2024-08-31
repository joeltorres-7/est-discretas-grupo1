package com.accesscontrol.app;

public class main {
    public static void main(String[] args) {
        // Ejemplo de uso:

        // Situación 1: Persona con tarjeta válida, conoce el código, no está bloqueada.
        boolean acceso1 = AccessControlManager.evaluarAcceso(true, true, false);
        System.out.println("Acceso otorgado: " + acceso1); // Debería imprimir true

        // Situación 2: Persona sin tarjeta válida, conoce el código, no está bloqueada.
        boolean acceso2 = AccessControlManager.evaluarAcceso(false, true, false);
        System.out.println("Acceso otorgado: " + acceso2); // Debería imprimir false

        // Situación 3: Persona con tarjeta válida, no conoce el código, no está bloqueada.
        boolean acceso3 = AccessControlManager.evaluarAcceso(true, false, false);
        System.out.println("Acceso otorgado: " + acceso3); // Debería imprimir false

        // Situación 4: Persona con tarjeta válida, conoce el código, pero está bloqueada.
        boolean acceso4 = AccessControlManager.evaluarAcceso(true, true, true);
        System.out.println("Acceso otorgado: " + acceso4); // Debería imprimir false
    }
}
