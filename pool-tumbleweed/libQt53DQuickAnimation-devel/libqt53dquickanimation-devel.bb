SUMMARY = "Development files for the Qt 5 3D Quick Animation library"
DESCRIPTION = "Development files for the Qt 5 3D Quick Animation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickAnimation-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "62b33a4535d617034e2c2464f07c1a96c56bcfda68f315d7402a21e7b1a9552acf2ec049a892b575a0674656ab450501c0d82f3de60c5c8cf374218201a4533f"

RPROVIDES:${PN} += "cmake-Qt53DQuickAnimation \
libQt53DQuickAnimation-devel \
pkgconfig-Qt53DQuickAnimation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickAnimation5 \
pkgconfig-Qt53DAnimation \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DQuick \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
