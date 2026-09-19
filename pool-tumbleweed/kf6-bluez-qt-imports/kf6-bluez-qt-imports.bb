SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-bluez-qt-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "8a2ec7f87737cba8acb4cf2863526438f8cd5ba4133434099c55c45a0638f797e9830a8db029a8a1dcc45b8784147a5d487577ba895bb54d0417e7827e1ec9cf"

RPROVIDES:${PN} += "kf6-bluez-qt-imports \
libbluezqtextensionplugin.so \
qt6qmlimport-org.kde.bluezqt \
qt6qmlimport-org.kde.bluezqt.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6BluezQt.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-org.kde.bluezqt.1"

inherit rpm
