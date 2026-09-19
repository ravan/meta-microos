SUMMARY = "Development files for the Qt5 network library"
DESCRIPTION = "Development files for the Qt5 network library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Network-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "9eaeb435a0e7a827b7dad1dc5f91b46c1aad8717910ca5492a3ff29bf1ce3c520143eb4cb6b51b0ca2e34624e559e65d37dc5b10027c554fc8427cf2a159e25d"

RPROVIDES:${PN} += "cmake-Qt5Network \
libQt5Network-devel \
pkgconfig-Qt5Network"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Network5 \
pkgconfig-Qt5Core"

inherit rpm
