SUMMARY = "Upload tool for AVR microcontrollers"
DESCRIPTION = "avrdude is a tool for AVR microcontrollers and drives many hardware \
in-system programmers. avrdude allows programming microcontrollers \
through a USB or parallel port of the computer."
LICENSE = "GPL-2.0-or-later"

PV = "8.0"

RPM_NAME = "avrdude-8.0-2.7.aarch64.rpm"
RPM_HASH = "f795df2caa7d7e825c7d192ba9201390d745813ed7614f8f0e970fcaa38c015c647c6e6b09722405eeca0dd80fffa2dbd2b1a4ec215a8a7f3e3ba3ba168d2764"

RPROVIDES:${PN} += "avr-programmer \
avrdude"

RDEPENDS:${PN} += "/sbin/modprobe \
/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavrdude.so.2 \
libavrdude2 \
libc.so.6"

inherit rpm
