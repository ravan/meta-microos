SUMMARY = "Devel files for libsysstat"
DESCRIPTION = "sysstat libraries for development."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libsysstat-qt5-devel-0.4.6-2.9.aarch64.rpm"
RPM_HASH = "f840e7e1b309c66e07a5f6a4c2c16219e975cf6397c37221ec6a771262204e556461a839b37b8e00dd752a4727aa3056491eae5b90d0801637c9360a1418da72"

RPROVIDES:${PN} += "cmake-sysstat-qt5 \
libsysstat-qt5-devel \
pkgconfig-sysstat-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsysstat-qt5-0 \
pkgconfig \
pkgconfig-Qt5Core"

inherit rpm
