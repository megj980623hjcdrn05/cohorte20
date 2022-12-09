/*Listas*/
/*in, not in*/
select * from productos;
select * from productos where  precio not in (5,6,7,8,9,10);
/*fechas */
select * from productos where date(fecha_alta) between '2015-01-01' and '2016-07-24';
select * from productos where precio = 5+5;
