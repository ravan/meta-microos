SUMMARY = "Qt5 websockets examples"
DESCRIPTION = "Examples for the libqt5-qtwebsockets module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde2"

RPM_NAME = "libqt5-qtwebsockets-examples-5.15.19+kde2-1.2.aarch64.rpm"
RPM_HASH = "5e5428dc35167970fe203bfad0034ac46f1463a1364b40ce3170637f7aa1cfe831b5614b684b5bb311e2e62d7d0e76d8f2db0b544b588230880ef096a2da9826"

RPROVIDES:${PN} += "libqt5-qtwebsockets-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Quick.so.5 \
libQt5WebSockets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtWebSockets.1"

inherit rpm
