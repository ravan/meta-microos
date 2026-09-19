SUMMARY = "Qt5 gamepad examples"
DESCRIPTION = "Examples for the libqt5-qtgamepad module."
LICENSE = "BSD-3-Clause & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtgamepad-examples-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "f80b83648d68cf9f6c4b094ab139031393876f198ff14db4e19ad365ed5c367c7c9e048780207f3fa513c646252cc85268e13fb2bf7bf555e596bde37ab322ad"

RPROVIDES:${PN} += "libqt5-qtgamepad-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gamepad.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGamepad.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
