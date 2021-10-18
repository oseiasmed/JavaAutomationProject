package br.com.oseiasmed.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {

	public static Date obterDataComDiferencaDias(int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		return calendar.getTime();
	}

	public static Date obterDataComDiferencaAno(int ano) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, ano);
		return calendar.getTime();
	}

	public static String obterDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("MM/dd/YYYY");
		return format.format(data);
	}
}
