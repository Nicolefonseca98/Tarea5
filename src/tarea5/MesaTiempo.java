/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

import domain.Producto;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import static java.util.concurrent.TimeUnit.*;

/**
 *
 * @author Wilmata
 */
public class MesaTiempo{
private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    
public void beepForAnHour() {
     final Runnable beeper = new Runnable() {
       public void run() { 
           System.out.println("Mesa ganadora: "); }
     };
     final ScheduledFuture<?> beeperHandle =
       scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
     scheduler.schedule(new Runnable() {
       public void run() { 
           beeperHandle.cancel(true); }
     }, 60 * 60, SECONDS);
   }
 }
    




    
    
    
    
    
//    private String nombre;
//
//	private Producto producto;
//
//	private long initialTime;
//
//	// Constructor, getter & setter
//
//	@Override
//	public void run() {
//             this.esperarXsegundos(5);
//		          System.out.println("Ejecutando thread");
//	}
//
//	private void esperarXsegundos(int segundos) {
//		try {
//			Thread.sleep(segundos * 1000);
//		} catch (InterruptedException ex) {
//			Thread.currentThread().interrupt();
//		}
//	}

//}
//    public void prueba ()
//    Timer t = new Timer();
//    t.schedule(new TimerTask() {
//    @Override
//    public void run() {
//       System.out.println("Hello World");
//    }
//}, 0, 5000);
////    @Override
////    public void run() {
////        System.out.println("Hello World!"); 
////    }
////    public void prueba () {
////        final Timer timer = new Timer();
////        TimerTask task = new TimerTask() {
////
////    @Override
////    public void run() {
////        System.out.println("acción acontecida");
////    }
////};
////timer.schedule(task, 0, 2000); // delay de 0 y se ejecuta cada 2 seg
////    }
//   public static void main(String[] args) {
//Timer timer = new Timer();
//timer.schedule(new PruebaTimer(), 0, 5);
//   }

