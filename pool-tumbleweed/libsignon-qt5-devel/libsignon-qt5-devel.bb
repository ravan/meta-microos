SUMMARY = "Development files for libsignon-qt1"
DESCRIPTION = "This package contains the development files for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "libsignon-qt5-devel-8.61-2.10.aarch64.rpm"
RPM_HASH = "e8477ac82bd4f20ec6e80db66aab8c3502cc61750995565421ebc009a06a558f26d13617cb58c4671cc3070dc4227a6a3c98a47846d4b4e1917776cd2a150a72"

RPROVIDES:${PN} += "cmake-SignOnQt5 \
libsignon-qt5-devel \
pkgconfig-libsignon-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-qt5-1 \
pkgconfig-Qt5Core"

inherit rpm
