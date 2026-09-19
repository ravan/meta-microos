SUMMARY = "QML imports for kcoreaddons"
DESCRIPTION = "QML imports for kcoreaddons."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcoreaddons-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "a0fff30d747d1a66ccd84cf1c762213eb234b123b067ce3e14bd53bc26e30d1bc2f9979f93dda62b00dc5adb65ce940130b9809a21dd5834e5d77a85f1c34704"

RPROVIDES:${PN} += "kf6-kcoreaddons-imports \
libkcoreaddonsplugin.so \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.coreaddons.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
