# Задача 1. Самая бесполезная коробка
## Описание
Мы узнали про volatile-переменные, в каких случаях они используются. Попробуем написать реализацию игрушки cамая бесполезная коробка. Один поток будет выключать тумблер, а второй будет эмулировать пользователя, то есть включать тумблер с какой-то периодичностью

## Работа программы
1. Создание поток-пользователь и поток-игрушка
1. Поток-пользователь раз в несколько секунд включает тумблер
1. Поток-игрушка как только обнаруживает включение - выключает тумблер
1. Поток-пользователь, после нескольких итераций завершает выполнение
1. Главный поток (main) после завершения потока-пользователя, останавливает поток-игрушку
## Требования к программе
1. Включение и выключение тумблера должно сопровождаться выводами в консоль
1. Все задержки (кол-во итераций работы потока, периодичность включения) должны быть оформлены в константах (никаких "Магических чисел")
