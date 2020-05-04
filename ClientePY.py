from suds.client import Client

url = "http://localhost:13000/conversor?wsdl"
client = Client(url)
tipo = int(input("Bem-vindo ao Conversor de Temperaturas, digite: \n1 para converter de Celsius para Kelvin: \n2 para converter de Kelvin para Celsius:\n>>> "))
temp = int(input("Digite a temperatura que deseja converter:\n>>> "))
response = client.service.conversor(tipo,temp)
print(response)
