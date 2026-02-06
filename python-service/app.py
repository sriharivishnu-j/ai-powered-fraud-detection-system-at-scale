from fastapi import FastAPI

app = FastAPI()

@app.get("/predict")
def predict():
    return {"message": "AI Model Prediction"}
