SUMMARY = "Qt5 Serial Port examples"
DESCRIPTION = "Examples for the libqt5-qtserialport module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtserialport-examples-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "ca680612bc09a6d401f20113f2ae27c25ca1c05353e04f2da8a9221687965271ba908aa47f8728438c6b65828dd59ee0899e5820027928338611bdd60dc3d821"

RPROVIDES:${PN} += "libqt5-qtserialport-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
