SUMMARY = "Devel files for libqtxdg"
DESCRIPTION = "QtXDG libraries for development"
LICENSE = "LGPL-2.1-only & SUSE-LGPL-2.1-with-digia-exception-1.1"

PV = "4.4.0"

RPM_NAME = "libqt6xdg-devel-4.4.0-1.7.aarch64.rpm"
RPM_HASH = "6789ea4537fd8d87e5685aacb821e508a1d6a5cdf1c6bd85982351c6b98eaa5b10d95e0f316fb6ef92cb71747007326fd7ee633173e03fbf0c8940366477a39b"

RPROVIDES:${PN} += "cmake-qt6xdg \
libqt6xdg-devel \
pkgconfig-Qt6Xdg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Xdg4 \
pkgconfig-Qt6Core \
pkgconfig-Qt6DBus \
pkgconfig-Qt6Widgets \
pkgconfig-Qt6XdgIconLoader \
pkgconfig-Qt6Xml"

inherit rpm
