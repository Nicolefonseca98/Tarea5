/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Wilmata
 */
public class PruebaTimer {
    public void prueba () {
        final Timer timer = new Timer();
        TimerTask task = new TimerTask() {

    @Override
    public void run() {
        System.out.println("acción acontecida");
    }
};
timer.schedule(task, 0, 2000); // delay de 0 y se ejecuta cada 2 seg
    }
}
