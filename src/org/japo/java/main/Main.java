/* 
 * Copyright 2019 ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean permisoOK;

        try {
            System.out.print("Tiene usted posesión de algún Permiso de Circulación de Vehículos(true/false): ");
            permisoOK = SCN.nextBoolean();

            if (permisoOK) {//esto es para declarar si dice una respuesta u otra responderle con el mensaje que queramos según su respuesta
                System.out.printf("Permiso de circulación: Apto%n");
            } else {
                System.out.printf("Permiso de circulación: No apto%n");
            }
        } catch (Exception e) {
            System.out.println("ERROR:LO SIENTO, HA HABIDO UN ERROR AL INTRODUCIR LOS DATOS");
        } finally {
            SCN.nextLine();
        }

    }

}
