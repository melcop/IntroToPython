from gpiozero import LED
from time import sleep

ledr = LED(25)
ledy = LED(24)
ledg = LED(23)


while True:
    ledr.on()
    sleep(2)
    ledr.off()
    sleep(1)

    ledy.on()
    sleep(2)
    ledy.off()
    sleep(1)

    ledg.on()
    sleep(2)
    ledg.off()
    sleep(1)

    ledr.on()
    ledy.on()
    ledg.on()
    sleep(4)
    ledr.off()
    ledy.off()
    ledg.off()
    sleep(1)