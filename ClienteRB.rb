require 'savon'

client  = Savon.client(wsdl: 'http://localhost:13000/conversor?wsdl')

puts "digite: \n1 para converter de Celsius para Kelvin: \n2 para converter de Kelvin para Celsius: "
tipo = gets

puts "Digite a temperatura que deseja converter: "
temp = gets

response = client.call(:conversor, message: { nome: tipo, temperatura: temp})

puts response.body[:conversor_response][:return]