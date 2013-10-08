-- Table: public.ciudades

-- DROP TABLE public.ciudades;

CREATE TABLE public.ciudades
(
  idciudad integer NOT NULL,
  nombre character varying(100),
  posicion geography,
  geom geometry(Point,4326),
  CONSTRAINT pk_ciudades PRIMARY KEY (idciudad)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.ciudades
  OWNER TO postgres;

  
  
-- Table: public.lugar

-- DROP TABLE public.lugar;

CREATE TABLE public.lugar
(
  id integer NOT NULL,
  nombre character varying(100),
  geom geometry,
  CONSTRAINT pk_lugares PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.lugar
  OWNER TO postgres;

  
  
-- Table: public.zonas_calor

-- DROP TABLE public.zonas_calor;

CREATE TABLE public.zonas_calor
(
  id integer NOT NULL,
  nombre character varying(100),
  style character varying(100),
  geom geometry,
  drawOrder  integer,
  CONSTRAINT pk_zc PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.zonas_calor
  OWNER TO postgres;
