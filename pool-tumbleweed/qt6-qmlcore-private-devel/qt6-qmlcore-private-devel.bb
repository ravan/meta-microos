SUMMARY = "Qt 6 QmlCore library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCore library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlcore-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "f7cd11cddf09b9ff9764dda9e560bc17a023f387ed85ee7a217dd4450869365144a2026b53a5edfb6ba62ee8cd8502d2da4c8be751a948bc433de8bc2075f838"

RPROVIDES:${PN} += "cmake-Qt6QmlCore \
cmake-Qt6QmlCorePrivate \
pkgconfig-Qt6QmlCore \
qt6-qmlcore-devel \
qt6-qmlcore-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6QmlCore6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
