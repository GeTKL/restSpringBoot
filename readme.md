SpringBoot - задание с питомцами

Значения для проверки в fiddlerе (compase):

Отправка данных: 
http://localhost:8080/sendSides

{
"north": "10-50",
"northEast": "51-100",
"east": "101-120",
"southEast": "121-150",
"south": "151-180",
"southWest": "181-210",
"west": "211-250",
"northWest": "251-290"
}

Для проверки полученных значений: http://localhost:8080/getAll

Для отправки запроса на получение стороны света:
http://localhost:8080/sendCord

{
"degree": 56
}