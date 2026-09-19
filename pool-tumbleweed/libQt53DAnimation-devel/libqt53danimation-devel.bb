SUMMARY = "Development files for the Qt 5 3D Animation library"
DESCRIPTION = "Development files for the Qt 5 3D Animation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DAnimation-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "533e01b55b95d6126a0d5f7db1a7bc75a31e8d153c4db41c43d4890c684686951c685b3bd928f0591c4b4e15d774d30780cd0437e741935d330ce7d7f6c4c736"

RPROVIDES:${PN} += "cmake-Qt53DAnimation \
libQt53DAnimation-devel \
pkgconfig-Qt53DAnimation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DAnimation5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
