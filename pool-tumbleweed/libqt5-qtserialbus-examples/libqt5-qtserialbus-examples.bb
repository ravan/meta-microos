SUMMARY = "Qt5 Serial Port examples"
DESCRIPTION = "Examples for the libqt5-qtserialbus module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtserialbus-examples-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "379650d7d36a048a607101439282a9392e044e6457c3f48a35d49f66b40aff73202126e1227c46bb1188014d67a320dcbe696f60263b87f78a0bce3eeb914f29"

RPROVIDES:${PN} += "libqt5-qtserialbus-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5SerialBus.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
