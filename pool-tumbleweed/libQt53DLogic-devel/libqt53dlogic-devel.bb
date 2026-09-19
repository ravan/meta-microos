SUMMARY = "Development files for the Qt 5 Logic 3D library"
DESCRIPTION = "Development files for the Qt 5 Logic 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DLogic-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "58fe62918f42aa8bd29c816e4ee43926945f8cdc421bceab4b72bae2d575c76da18d686cd1d1de5665cb7a0b15d873a85b56007e9c531d2612d14012750a9ad8"

RPROVIDES:${PN} += "cmake-Qt53DLogic \
libQt53DLogic-devel \
pkgconfig-Qt53DLogic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DLogic5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
