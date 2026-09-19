SUMMARY = "QML components for networkmanager-qt"
DESCRIPTION = "This package provides QML bindings for networkmanager-qt."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-networkmanager-qt-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "b82e1a7806bf08c2a7f8f2146d13eb6e89ad4308079cfc14548542aa1fa61a062ee80f09ce44990d73a829d8bbfddbc5676c05d3c7f7bca5241219446e82589c"

RPROVIDES:${PN} += "kf6-networkmanager-qt-imports \
libnetworkmanagerqtqml.so \
qt6qmlimport-org.kde.networkmanager \
qt6qmlimport-org.kde.networkmanager.254"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6NetworkManagerQt.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
