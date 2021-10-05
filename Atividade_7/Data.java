package Atividade_7;

public class Data extends Object

	{

		private int mes;

		private int dia;

		private int ano;
		
		public Data() {
			
		}

		public Data(int d, int m, int a)

		{

			setMes(m);

			setAno(a);

			dia = validaDia(d);

		}

		private int validaDia(int dia)

		{

			int diasPorMes[] =

					{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			if (dia > 0 && dia <= diasPorMes[mes])

				return dia;

			if (mes == 2 && dia == 29 &&

					(ano % 400 == 0 ||

							(ano % 4 == 0 && ano % 100 != 0)))

				return dia;

			System.out.println("Dia " + dia +

					" inválido. Dia alterado para 1.");

			return 1;

		}

		public String toString()

		{

			return dia + "/" + mes + "/" + ano;

		}

	public void setAno(int a)

	{

	if (a>0) ano = a;

	else

	{

	System.out.println("Valor de ano inválido! Ano alterado para 2005");

	ano = 2005;

	}

	}

	public void setMes(int m)

	{

	if (m>=1 && m<=12)

	mes = m;

	else

	{

	System.out.println("Valor de mes inválido!	Mes alterado para 1");

	mes = 1;

	}

	}

		public void setDia(int d)
		{
			dia = validaDia(d);
		}

		public int getDia()
		{
			return dia;
		}

		public int getAno()
		{
			return ano;
		}

		public int getMes()
		{
			return mes;
		}

	}

