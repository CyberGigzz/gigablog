from fastapi import FastAPI
from app.config.config import settings

def create_app() -> FastAPI:
    app = FastAPI()

    @app.get("/")
    def root():
        return {"message": "Hello World"}

    return app

app = create_app()