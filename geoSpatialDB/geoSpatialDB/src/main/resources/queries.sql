
-- interseccion entre las zonas de calor y los lugares
select *
from lugar as l
join zonas_calor as zc ON ST_Intersects(l.geom, zc.geom)


--lugares que esten a 100 metros de las zonnas
select *
from lugar as l 
inner join zonas_calor as zc ON ST_DWithin(l.geom::geography, zc.geom::geography, 100)



CREATE INDEX zonas_calor_geom_gist ON public.zonas_calor USING GIST(geom);



UPDATE public.ciudades SET geom = ST_SetSRID(geom, 4326);

--Add the contraint 
ALTER TABLE public.ciudades ADD CONSTRAINT city_srid_geom CHECK (st_srid(geom) = (4326));