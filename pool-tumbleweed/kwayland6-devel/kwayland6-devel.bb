SUMMARY = "KDE Wayland library: Build Environment"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "kwayland6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "a919881bc872be938fe8f61f78e9dde662ded6cb6a5128c5710b58137a9dccd4256da6b4578a11e31fe7b3dfe278723344b201414cf1b55aaa72e9235fb48aea"

RPROVIDES:${PN} += "cmake-KWayland \
kwayland6-devel \
pkgconfig-KWaylandClient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libKWaylandClient6 \
pkgconfig-Qt6Gui"

inherit rpm
