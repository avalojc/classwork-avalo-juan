--
-- PostgreSQL database dump
--

-- Dumped from database version 11.5
-- Dumped by pg_dump version 11.5

-- Started on 2020-11-03 14:02:04

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE "Battleship";
--
-- TOC entry 2828 (class 1262 OID 42990)
-- Name: Battleship; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "Battleship" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';


ALTER DATABASE "Battleship" OWNER TO "postgres";

\connect "Battleship"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 199 (class 1259 OID 43018)
-- Name: BattleshipGame; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE "public"."BattleshipGame" (
    "battleshipBoard0" integer NOT NULL,
    "battleshipBoard1" integer NOT NULL,
    "gameId" integer NOT NULL,
    "totalGuesses" numeric(2,0) NOT NULL,
    "guessedPosition" numeric(2,0)[] NOT NULL
);


ALTER TABLE "public"."BattleshipGame" OWNER TO "postgres";

--
-- TOC entry 196 (class 1259 OID 43012)
-- Name: BattleshipGame_battleshipBoard0_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE "public"."BattleshipGame_battleshipBoard0_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE "public"."BattleshipGame_battleshipBoard0_seq" OWNER TO "postgres";

--
-- TOC entry 2829 (class 0 OID 0)
-- Dependencies: 196
-- Name: BattleshipGame_battleshipBoard0_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE "public"."BattleshipGame_battleshipBoard0_seq" OWNED BY "public"."BattleshipGame"."battleshipBoard0";


--
-- TOC entry 197 (class 1259 OID 43014)
-- Name: BattleshipGame_battleshipBoard1_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE "public"."BattleshipGame_battleshipBoard1_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE "public"."BattleshipGame_battleshipBoard1_seq" OWNER TO "postgres";

--
-- TOC entry 2830 (class 0 OID 0)
-- Dependencies: 197
-- Name: BattleshipGame_battleshipBoard1_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE "public"."BattleshipGame_battleshipBoard1_seq" OWNED BY "public"."BattleshipGame"."battleshipBoard1";


--
-- TOC entry 198 (class 1259 OID 43016)
-- Name: BattleshipGame_gameId_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE "public"."BattleshipGame_gameId_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE "public"."BattleshipGame_gameId_seq" OWNER TO "postgres";

--
-- TOC entry 2831 (class 0 OID 0)
-- Dependencies: 198
-- Name: BattleshipGame_gameId_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE "public"."BattleshipGame_gameId_seq" OWNED BY "public"."BattleshipGame"."gameId";


--
-- TOC entry 2697 (class 2604 OID 43021)
-- Name: BattleshipGame battleshipBoard0; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "public"."BattleshipGame" ALTER COLUMN "battleshipBoard0" SET DEFAULT "nextval"('"public"."BattleshipGame_battleshipBoard0_seq"'::"regclass");


--
-- TOC entry 2698 (class 2604 OID 43022)
-- Name: BattleshipGame battleshipBoard1; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "public"."BattleshipGame" ALTER COLUMN "battleshipBoard1" SET DEFAULT "nextval"('"public"."BattleshipGame_battleshipBoard1_seq"'::"regclass");


--
-- TOC entry 2699 (class 2604 OID 43023)
-- Name: BattleshipGame gameId; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "public"."BattleshipGame" ALTER COLUMN "gameId" SET DEFAULT "nextval"('"public"."BattleshipGame_gameId_seq"'::"regclass");


--
-- TOC entry 2701 (class 2606 OID 43028)
-- Name: BattleshipGame BattleshipGame_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "public"."BattleshipGame"
    ADD CONSTRAINT "BattleshipGame_pkey" PRIMARY KEY ("gameId");


-- Completed on 2020-11-03 14:02:05

--
-- PostgreSQL database dump complete
--

