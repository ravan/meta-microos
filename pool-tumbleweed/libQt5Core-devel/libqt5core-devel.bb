SUMMARY = "Development files for the Qt5 core library"
DESCRIPTION = "Development files for the Qt5 core library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Core-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "67eaf202617f2220ade0e7bd5a4d738e3c1966cbf2b065cb9bb15e6dc88e2b73d11a46ed4c5dbf2d5429a2644596963ec6f7a136e883483bcdda4b6a6c864d70"

RPROVIDES:${PN} += "cmake-Qt5 \
cmake-Qt5Core \
libQt5Core-devel \
pkgconfig-Qt5Core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core5 \
libqt5-qtbase-common-devel"

inherit rpm
