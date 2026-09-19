SUMMARY = "SDDM Greeter for Qt5 themes"
DESCRIPTION = "This package provides the SDDM frontend for themes using Qt 5."
LICENSE = "GPL-2.0-or-later"

PV = "0.21.0+git57"

RPM_NAME = "sddm-greeter-qt5-0.21.0+git57-1.1.aarch64.rpm"
RPM_HASH = "07a8b51b043e7808607f42b67a8e3a086c0d59588a83ebdef28bfcff85472be9c97176526ba5b8201791252316570d04b7e9a5d21c64a565e16e9f5554fc0bf4"

RPROVIDES:${PN} += "qt5qmlimport-SddmComponents.2 \
sddm-greeter-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
qt5qmlimport-QtQuick.2 \
sddm"

inherit rpm
