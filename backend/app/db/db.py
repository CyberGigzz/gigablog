import os
from typing import Optional
from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.pool import NullPool
import psycopg2
from config import Config

Base = declarative_base()

def get_engine(cfg: Config):
    connection_string = cfg.db_dsn
    try:
        engine = create_engine(
            connection_string,
            poolclass=NullPool,
            connect_args={
                'connect_timeout': 5, 
                'options': '-c statement_timeout=15000'
            }
        )
        
        return engine
    except psycopg2.Error as e:
        print(f"Error connecting to the database: {e}")
        raise

def get_sessionmaker(engine):
    return sessionmaker(autocommit=False, autoflush=False, bind=engine)

def init_db(cfg: Config):
    engine = get_engine(cfg)
    Base.metadata.create_all(engine)
    Session = get_sessionmaker(engine)
    return Session()

