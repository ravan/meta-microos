SUMMARY = "KDE Wayland library: Build Environment"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kwayland-devel-5.116.0-2.10.aarch64.rpm"
RPM_HASH = "e18460647a8faac9f6b88c92f24371204c2446413b25f5b396634d4d8353a5d41b131b9110ed1df4310511d4e2ded27ce67bcbc801fa8ed9a2a06ed4c2ae3082"

RPROVIDES:${PN} += "cmake-KF5Wayland \
kwayland-devel \
pkgconfig-KF5WaylandClient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Gui \
kwayland \
pkgconfig-Qt5Gui"

inherit rpm
