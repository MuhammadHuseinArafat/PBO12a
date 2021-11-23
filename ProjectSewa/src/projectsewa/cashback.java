/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsewa;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class cashback extends perental {
    public int jmlCashback;
    
    int cashback(){
         if (null == this.id){
             this.jmlCashback = 0;
         } else switch (this.id) {
            case "M002":
                this.jmlCashback = 5000;
                break;
            case "M003":
                this.jmlCashback = 10000;
                break;
            default:
                this.jmlCashback = 0;
                break;
        }
        return this.jmlCashback;
    }
}

