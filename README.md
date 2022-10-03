# restaurant-server-master

-- Table: labtic.sport_centers

-- DROP TABLE IF EXISTS labtic.sport_centers;

CREATE TABLE IF NOT EXISTS labtic.sport_centers
(
    center_id integer NOT NULL DEFAULT nextval('labtic.sport_centers_center_id_seq'::regclass),
    commercial_name character varying(50) COLLATE pg_catalog."default",
    business_name character varying(50) COLLATE pg_catalog."default",
    start_time time without time zone,
    close_time time without time zone,
    user_insert integer,
    insert_date timestamp without time zone,
    user_update integer,
    update_date timestamp without time zone,
    adstatus character varying(1) COLLATE pg_catalog."default" DEFAULT 'A'::character varying,
    id bigint NOT NULL,
    CONSTRAINT sport_centers_pkey PRIMARY KEY (center_id),
    CONSTRAINT user_insert_fk FOREIGN KEY (user_insert)
        REFERENCES labtic.users (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT user_update_fk FOREIGN KEY (user_update)
        REFERENCES labtic.users (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS labtic.sport_centers
    OWNER to postgres;
