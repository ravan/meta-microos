SUMMARY = "Development files for the Qt 5 Input 3D library"
DESCRIPTION = "Development files for the Qt 5 Input 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DInput-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "e61f6b635338d94e8c1ef0586abbb125b12a00b027fd6323d9136cd6f1bf70b78736b7f3559ed958948baa93d802c0b74d556798260d48685c9d1bb2a4794e64"

RPROVIDES:${PN} += "cmake-Qt53DInput \
libQt53DInput-devel \
pkgconfig-Qt53DInput"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DInput5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
