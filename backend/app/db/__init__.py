from dotenv import load_dotenv
from sqlalchemy import create_engine
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker

load_dotenv()

DATABASE_URL = "sqlite:///./test.db"


DATABASE_URL = "postgresql://user:password@host:port/database"