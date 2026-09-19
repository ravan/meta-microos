SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Based on Qt Quick Controls 2. This package contains the base shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Kirigami2-5-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "dca1d9e91c7bfd1467e024797592eeb479668de3c42e99106c22e803c6e4c74608f08fb5e61e19333d2e104bc06d049db585b33fcd79d02b3a3883b843ee6f42"

RPROVIDES:${PN} += "libKF5Kirigami2-5 \
libKF5Kirigami2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
