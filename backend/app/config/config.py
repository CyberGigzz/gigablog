import os
from dataclasses import dataclass
from dotenv import load_dotenv
import argparse
from typing import Optional

load_dotenv()

@dataclass
class Config:
    port: int = 3000
    env: str = "development"
    db_dsn: str = "postgresql://user:password@host:port/database"
    db_max_open_conns: int = 25
    db_max_idle_conns: int = 25
    db_max_idle_time: str = "15m"

    def __post_init__(self):
        self._load_from_env()
        # self._load_from_cli()

    def _load_from_env(self):
        try:
            self.port = int(os.environ.get("PORT", self.port))
        except ValueError:
            print("Error: PORT must be an integer.")
            # Handle the error appropriately (e.g., exit or use a default)

        self.env = os.environ.get("ENV", self.env)
        self.db_dsn = os.environ.get("DB_DSN", self.db_dsn)
        try:
            self.db_max_open_conns = int(os.environ.get("DB_MAX_OPEN_CONNS", self.db_max_open_conns))
        except ValueError:
            print("Error: DB_MAX_OPEN_CONNS must be an integer.")
        try:
            self.db_max_idle_conns = int(os.environ.get("DB_MAX_IDLE_CONNS", self.db_max_idle_conns))
        except ValueError:
            print("Error: DB_MAX_IDLE_CONNS must be an integer.")
        self.db_max_idle_time = os.environ.get("DB_MAX_IDLE_TIME", self.db_max_idle_time)

    def _load_from_cli(self):
        # Only parse known arguments
        parser = argparse.ArgumentParser()
        parser.add_argument("--port", type=int, help="Port number")
        parser.add_argument("--env", help="Environment")
        parser.add_argument("--db-dsn", help="Database DSN")
        parser.add_argument("--db-max-open-conns", type=int, help="Max open connections")
        parser.add_argument("--db-max-idle-conns", type=int, help="Max idle connections")
        parser.add_argument("--db-max-idle-time", help="Max idle time")

        # Parse only known arguments
        args, _ = parser.parse_known_args()

        if args.port is not None:
            self.port = args.port
        if args.env:
            self.env = args.env
        if args.db_dsn:
            self.db_dsn = args.db_dsn
        if args.db_max_open_conns is not None:
            self.db_max_open_conns = args.db_max_open_conns
        if args.db_max_idle_conns is not None:
            self.db_max_idle_conns = args.db_max_idle_conns
        if args.db_max_idle_time:
            self.db_max_idle_time = args.db_max_idle_time

settings = Config()

print(settings) # 
