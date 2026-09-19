SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Development files for attica, Attica a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "attica-qt5-devel-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "a21cf9cacf7f2015447f799196f7fe81b3d29fc36186e5d9f9d31f12538a3909ebd121de965debe804d3f793badd17390fe2494c3a143a0a97845b786c4ea0da"

RPROVIDES:${PN} += "attica-qt5-devel \
cmake-KF5Attica \
pkgconfig-libKF5Attica"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
cmake-Qt5Network \
cmake-Qt5Widgets \
libKF5Attica5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
