SUMMARY = "I2C Serial EEPROM Programming Tool for the WCH CH341A"
DESCRIPTION = "An I2C serial EEPROM programming tool for cheap Winchiphead CH341 IC based programmers."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "ch341eepromtool-0.5-2.9.aarch64.rpm"
RPM_HASH = "912f28f45befdd09c657a3b2747a7ec58c959d17485839d2f26a6862babb08c3419ba1c951cc9283b8b457d7d3f642caaefdc9046606dc86aced1bf07c5bf098"

RPROVIDES:${PN} += "ch341eepromtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
