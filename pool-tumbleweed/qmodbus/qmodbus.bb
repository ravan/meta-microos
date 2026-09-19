SUMMARY = "QT ModBus tools"
DESCRIPTION = "QModBus is an implementation of a ModBus master application. \
A graphical user interface allows easy communication with ModBus \
slaves over serial line interface. QModBus also includes a bus \
monitor for sniffing all traffic on the bus."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "qmodbus-0.3.0-1.26.aarch64.rpm"
RPM_HASH = "27ff7a40b2b9d8a7da10a18a08a9f2e8781997de40f167599137e30840fe79d7fb4bd11f2090d88b480b3de28ccdd16e345ab35dc6af3a9a7a0ef83a2cd398d8"

RPROVIDES:${PN} += "bundled-QextSerialPort \
bundled-libmodbus \
qmodbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
