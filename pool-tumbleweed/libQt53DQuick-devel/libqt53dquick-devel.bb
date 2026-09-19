SUMMARY = "Development files for the Qt 5 Quick 3D library"
DESCRIPTION = "Development files for the Qt 5 Quick 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuick-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "9b70a5184259243165551897db18196cface55f7cc684b184555dce5b87f9c771b281fecf67481a40ba55347b0b55e63f35a15fbee5f96774314af1d6bdc1283"

RPROVIDES:${PN} += "cmake-Qt53DQuick \
libQt53DQuick-devel \
pkgconfig-Qt53DQuick"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuick5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick"

inherit rpm
