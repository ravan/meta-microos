SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Development package to build Qt-based compositors."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde55"

RPM_NAME = "libqt5-qtwayland-devel-5.15.19+kde55-1.2.aarch64.rpm"
RPM_HASH = "79935ed64b715eb29d7b6b03bc7418000e187b22fb00343d6b35429697f1f0e13981389007bd99840e4bae5da9580d877516a98adf14fc9b201cba49703eb39a"

RPROVIDES:${PN} += "cmake-Qt5WaylandClient \
cmake-Qt5WaylandCompositor \
libqt5-qtwayland-devel \
pkgconfig-Qt5WaylandClient \
pkgconfig-Qt5WaylandCompositor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WaylandClient5 \
libQt5WaylandCompositor5 \
libqt5-qtwayland \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick"

inherit rpm
