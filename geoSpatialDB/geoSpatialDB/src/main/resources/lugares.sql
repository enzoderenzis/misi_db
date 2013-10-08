INSERT INTO lugar (id, nombre, geom)
VALUES (1, 'Central Park',ST_GeomFromText('POLYGON((
-73.973057 40.764356,
-73.981898 40.768094,
-73.958209 40.800621,
-73.949282 40.796853,
-73.973057 40.764356))',4269));


﻿INSERT INTO lugar (id, nombre, geom)
VALUES (2, 'UTN-FRC',ST_GeomFromText('POLYGON((
-64.19437 -31.4431593222, 
-64.193080 -31.4409982222, 
-64.191880 -31.4413055222,
-64.192080 -31.4417055222,
-64.190680 -31.4415055222,
-64.190530 -31.4429180222,
-64.19410 -31.4432950222,
-64.19437 -31.4431593222
))',4269));
-- el primer punto y el ultimo deben ser los mismos para que cierre el poligono-- Table: public.zonas_calor




