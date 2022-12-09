SELECT * FROM tiendita.categoria;
select * from productos;
select nombre, precio, existencia, idCategoria from productos where idCategoria <= 2;

select min(existencia) as existencia_minima, max(existencia) as existencia_maxima from productos;
select * from productos limit 6,3;
/* order by, asc, desc*/
select * from productos order by nombre desc, existencia asc;
