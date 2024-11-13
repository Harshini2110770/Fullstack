FROM python:3.9
WORKDIR /app
COPY . /app 
RUN pip install flask
EXPOSE 5000
ENV NAME=Flaskapp
CMD ["python","app.py"]
