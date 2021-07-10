/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Evandro
 */
public class TrabalhandoComDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date newData = new Date(); 
        System.out.println(newData); // passando a data atual para impressao
        // sat jul 10 11:32:44 BRT 2021
        
        long currentTimeMillis = System.currentTimeMillis(); 
        System.out.println(currentTimeMillis); // passando milisegundos
        // 1625927564695
        
        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
        // sat jul 10 11:32:44 BRT 2021
        
        Calendar agora = Calendar.getInstance();
        System.out.println(agora);
        /*java.util.GregorianCalendar[ time=1625928906508,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
        zone=sun.util.calendar.ZoneInfo[
            id="America/Sao_Paulo",
            offset=-10800000,
            dstSavings=0,
            useDaylight=false,
            transitions=93,
            lastRule=null
        ],
        firstDayOfWeek=1,
        minimalDaysInFirstWeek=1,
        ERA=1,
        YEAR=2021,
        MONTH=6,
        WEEK_OF_YEAR=28,
        WEEK_OF_MONTH=2,
        DAY_OF_MONTH=10,
        DAY_OF_YEAR=191,
        DAY_OF_WEEK=7,
        DAY_OF_WEEK_IN_MONTH=2,
        AM_PM=0,
        HOUR=11,
        HOUR_OF_DAY=11,
        MINUTE=55,SECOND=6,
        MILLISECOND=508,
        ZONE_OFFSET=-10800000,
        DST_OFFSET=0]*/
        
        Calendar datas = Calendar.getInstance();
        System.out.println("A data corrente é: "+datas.getTime());
        // A data corrente é: Sat Jul 10 12:27:04 BRT 2021
        
        datas.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: "+datas.getTime());
        // 15 dias atrás: Fri jun 25 12:27:04 BRT 2021
        
        datas.add(Calendar.MONTH, 6);
        System.out.println("6 meses depois: "+datas.getTime());
        // 6 meses depois: Sat Dec 25 12:31:05 BRT 2021
        
        datas.add(Calendar.YEAR, 1);
        System.out.println("1 ano depois: "+datas.getTime());
        // 1 ano depois: Sun Dec 25 12:33:32 BRT 2022
        
        // Formatação das horas com DateFormat
        
        String dataToStr = DateFormat.getInstance().format(newData); // atribuindo formatação a instancia newData
        System.out.println(dataToStr);
        // 7/10/2021 12:56 PM   formatação default do metodo format().
        
        dataToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(newData);
        System.out.println(dataToStr);
        // 1:12:06 PM BRT
        
        dataToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(newData);
        System.out.println(dataToStr);
        // 1:13 PM
        
        dataToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(newData);
        System.out.println(dataToStr);
        // 1:13:54 PM
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        
        String dataFormatada = formatter.format(newData);
        System.out.println(dataFormatada);
        // 10/22/2021
        
        // Localdate e LocalTime Java8+
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        // saida padrão 2021-07-10
        
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);
        // dia anteriror 2021-07-09
        
        LocalDate anoQueVem = hoje.plusYears(1);
        System.out.println(anoQueVem);
        // ano seguinte 2022-07-10
        
        LocalTime horas = LocalTime.now();
        System.out.println(horas);
        // 13:42:55.262
        
        LocalTime horaSeguinte = horas.plusHours(1);
        System.out.println(horaSeguinte);
        // 14:44:34.727
        
        LocalTime horarioAnterior = horas.minusHours(1);
        System.out.println(horarioAnterior);
        // 12:46:20.301
        
        LocalDateTime dataEHora = LocalDateTime.now();
        System.out.println(dataEHora);
        // padrão 2021-07-10T13:49:36.059
        
    }   
    
}
