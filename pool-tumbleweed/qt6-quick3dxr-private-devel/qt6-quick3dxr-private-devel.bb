SUMMARY = "Qt 6 Quick3DXr library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DXr library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dxr-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6e7075f47562cc281b998d4b4625f2bc805b46b917dc84530e47cff14bba5ec94a8aac222a5ff24dd05374df5ff9f22f84ec2cf8a27fa9b7d3234248bb44dbe9"

RPROVIDES:${PN} += "cmake-Qt6Quick3DXr \
cmake-Qt6Quick3DXrPrivate \
pkgconfig-Qt6Quick3DXr \
qt6-quick3dxr-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Quick3DXr6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D"

inherit rpm
