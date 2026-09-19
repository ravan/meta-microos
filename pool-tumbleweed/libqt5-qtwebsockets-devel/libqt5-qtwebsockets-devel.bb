SUMMARY = "Development files for the Qt5 WebSockets library"
DESCRIPTION = "You need this package if you want to compile programs with QtWebSockets."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde2"

RPM_NAME = "libqt5-qtwebsockets-devel-5.15.19+kde2-1.2.aarch64.rpm"
RPM_HASH = "8f3e483c38635f2f958d327da2b1504270eba329951f92c008dc76f16752c28001511700b8d56d06aa2e0b1922c3a2ea846fd56713728c8b23edcfaa320547f1"

RPROVIDES:${PN} += "cmake-Qt5WebSockets \
libqt5-qtwebsockets-devel \
pkgconfig-Qt5WebSockets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WebSockets5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
