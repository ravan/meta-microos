SUMMARY = "Qt6 Quick3DHelpersImpl library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dhelpersimpl-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "08a5d07892875cb8f3e6f4133747cce7790f78dfcf636a029f493eaf164a852f878e6dcea46a4ddfb6271ab47c5c945c171314ab4b10a2656d2f511f5a20c110"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpersImpl \
pkgconfig-Qt6Quick3DHelpersImpl \
qt6-quick3dhelpersimpl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3DPrivate \
libQt6Quick3DHelpersImpl6"

inherit rpm
