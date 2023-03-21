from gpiozero import PWMLED
from time import sleep

# led rød, på pin 25
ledr = PWMLED(25)
# led gul, på pin 24
ledy = PWMLED(25)
# led grøn, på pin 23
ledg = PWMLED(25)
# Initializer i
i = 0

while True:
    ledr.value = i
    ledy.value = i
    ledg.value = i
    i+=0.01
    sleep(0.1)
    if i > 0.6:
        i = 0
        ledr.value = i
        ledy.value = i
        ledg.value = i
        sleep(3)
        