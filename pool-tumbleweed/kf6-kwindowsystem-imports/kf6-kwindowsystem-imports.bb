SUMMARY = "QML Bindings for KWindowSystem"
DESCRIPTION = "QML Bindings for KWindowSystem."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwindowsystem-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4fd3d53873f5c960b09df97ae2d94dc431ecc71f675e2a9a173f5831366101cfbdd399f81f2fb0668b5f9be05eddb7fcd60ccf0bc611c71c8cd1fb2172f1c201"

RPROVIDES:${PN} += "kf6-kwindowsystem-imports \
libKWindowSystem.so \
qt6qmlimport-org.kde.kwindowsystem \
qt6qmlimport-org.kde.kwindowsystem.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
