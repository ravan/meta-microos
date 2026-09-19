SUMMARY = "QtQuick bindings for configuration entities"
DESCRIPTION = "KConfigQml provides QtQuick bindings to KConfig, which allows using the library with \
QML."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5ConfigQml5-5.116.0-2.8.aarch64.rpm"
RPM_HASH = "5458fe673bae55f07909088367e28a78499d54dd636591883e69e6049696a46f42bf0040353c2c8619b32d45d9f665d57277f3b0612fd116869dca745f40cdae"

RPROVIDES:${PN} += "libKF5ConfigQml.so.5 \
libKF5ConfigQml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigCore5 \
libKF5ConfigGui5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui5 \
libQt5Qml.so.5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
