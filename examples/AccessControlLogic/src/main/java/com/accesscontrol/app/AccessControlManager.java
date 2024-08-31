package com.accesscontrol.app;

public class AccessControlManager {
    public static boolean evaluarAcceso(boolean tarjetaValida, boolean conoceCodigo, boolean usuarioBloqueado) {
        // Si el usuario está bloqueado, el acceso es denegado automáticamente.
        if (usuarioBloqueado) {
            return false;
        }
        // Si tiene tarjeta válida y conoce el código, se otorga el acceso.
        return tarjetaValida && conoceCodigo;
    }
}
