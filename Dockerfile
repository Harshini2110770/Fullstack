FROM python:3.9
WORKDIR /app
COPY requirements.txt . 
COPY ./src /app/src  
RUN pip install flask
EXPOSE 5000
ENV NAME Flaskapp
CMD ["python","app.py"]
