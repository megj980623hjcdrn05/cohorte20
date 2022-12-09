/*joins*/
select * from productos;
select * from categoria;
select * from productos, categoria where idCategoria = id;
select p.nombre, p.precio, p.existencia, c.nombre from productos as p inner join categoria as c on p.idCategoria = c.id;


select p.nombre, p.precio, p.existencia, t.nombre from productos as p left join temporal as t on p.idCategoria = t.id;

select p.nombre, p.precio, p.existencia, t.nombre from productos as p right join temporal as t on p.idCategoria = t.id;

select * from proveedores ;
select * from categoria union select * from proveedores;

select * from categoria union select nombre, precio from productos;

/* multi consulta*/
select p.nombre, p.precio, p.existencia from productos as p inner join categoria as c on p.idCategoria = c.id;
select * from detalle_producto_proveedor;

select p.nombre as nom_producto, c.nombre as nom_categoria, pv.nombre as nom_proveedor 
from productos as p
inner join categoria as c
on p.idCategoria = c.id
inner join detalle_producto_proveedor as det
on p.idCategoria=det.idProducto
inner join 


