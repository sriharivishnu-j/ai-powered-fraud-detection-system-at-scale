from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

class Transaction(BaseModel):
    transaction_id: str
    amount: float

@app.post("/predict")
async def predict(transaction: Transaction):
    # Placeholder for PyTorch model prediction
    return {"fraud": False, "confidence": 0.95}