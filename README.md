# ovgl2js
Tool for migrating Ovation graphics language to JavaScript
(with ANTLR (ANother Tool for Language Recognition))

## Функция отображения видеокадров в АСУТП Ovation.
Функция отображения видеокадров предназначена для представления оператору технологической информации
на видеокадрах в виде мнемосхем, гистограмм и в табличной форме.

АСУТП Ovation, предлагает высококачественную графику на базе стандартных графических элементов,
которая обеспечивает эффективное управление оборудованием предприятия,
в точности отражающимся его структуру через видеокадры.

[пример видеокадра 3301](https://github.com/sergoleg/ovgl2js/blob/main/example/png/3301.png)

Программа Graphics Builder (GB) используется для создания видеокадров,
отображаемых на Операторской станции системы Ovation.

Видеокадры являются программами, отображающими графические образы оборудования,
управляющего технологическими процессами предприятия.

В пакете GB создаются и редактируются два файла видеокадров (исходный и объектный).

Файл источника (.src) является ASCII-файлом представления видеокадра, предназначенным только для чтения,
и соответствует синтаксису проблемно-ориентируемого языка графики,
специфицированному в документе [Graphics Language Reference Manual for Ovation](https://github.com/sergoleg/ovgl2js/blob/main/example/OW240_91%20Graphics%20Language%20Reference%20Manual%20for%20Ovation%202.4.pdf)
.

[пример src файла видеокадра 3301](https://github.com/sergoleg/ovgl2js/blob/main/example/gl/3301.src)

Примеры файлов MACRO и POPUP WINDOW смотри в ovgl2js/example/gl/*.src.

Файл объекта (.diag) является “исполняемым” файлом видеокадра, отображаемой на Операторской станции системы Ovation.

## Мотивация.
Разработка ПО отображения видеокадров системы Ovation на терминалах с использованием Веб-технологий (удаленный веб терминал – remote web terminal (RWT)).

Бизнес-требования:
- ПО RWT должно отображать видеокадры (не меньше 1000 шт.) Операторских станций систем АСУТП Ovation на Веб-терминалах – с любого устройства,
где есть Веб-обозреватель, находясь в любом месте и в любое время, не устанавливая специальное ПО.

Требования пользователей:
- ПО RWT должно повторять внешний вид видеокадров Операторских станций.
В определенном смысле видеокадры RWT должны быть равносильны видеокадрам Операторских станций.

Функциональные требования:
- ПО RWT должно преобразовывать ASCII-файл представления видеокадра,
содержащий код графического языка и языка доступа к данным и Ovation,
в программу на другом языке, интерпретируемым стандартным Веб-обозревателем.
[Метод достижения цели](https://github.com/sergoleg/ovgl2js/blob/main/example/data_pipeline.jpg)

## Задача.
Разработать приложение транслирующее алгоритмический проблемно-ориентированный язык графики в язык JavaScript. 

## Результат.
[Ovation ® Graphics Language LEXER](https://github.com/sergoleg/ovgl2js/blob/main/grammar/glLexer.g4)

[Ovation ® Graphics Language PARSER](https://github.com/sergoleg/ovgl2js/blob/main/grammar/glParser.g4)

[Технический отчет](https://github.com/sergoleg/ovgl2js/blob/main/example/Tech%20Tips%20for%20HMI%20Ovation.pdf "Tech Tips for HMI Ovation")

[пример diag файла видеокадра 3301 на JavaScript](https://github.com/sergoleg/ovgl2js/blob/main/example/js/3301.diag.js)

## О себе.

[Актуальное резюме от 19.02.2022 (ru)](https://github.com/sergoleg/ovgl2js/blob/main/rezjumeOlegSergeev_ru.pdf)

[Актуальное резюме от 19.02.2022 (en)](https://github.com/sergoleg/ovgl2js/blob/main/rezjumeOlegSergeev_en.pdf)
