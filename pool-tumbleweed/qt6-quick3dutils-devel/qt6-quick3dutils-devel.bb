SUMMARY = "Qt6 Quick3DUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dutils-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e1dc4b207d985fdd118520528364b5af14f5f2564cdc1fb02fc16088689e3d50ef6ca09b309d19c7b7855e6b53e1286284001ebad1bc23958f370e6ee2b89dd6"

RPROVIDES:${PN} += "cmake-Qt6Quick3DUtils \
pkgconfig-Qt6Quick3DUtils \
qt6-quick3dutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
libQt6Quick3DUtils6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
