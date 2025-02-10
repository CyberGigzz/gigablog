import sys
import os

from app.config.config import Config

settings = Config()

# FastAPI app code
from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def read_root():
    return {"message": "Hello, World!"}