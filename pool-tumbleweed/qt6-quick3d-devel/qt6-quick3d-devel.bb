SUMMARY = "Qt 6 Quick3D library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3D library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3d-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "30016210e7a834cf80ea2235775d3513d145a1bb5a25570c9b9f94af98e0104f4572fef9be2cf47b0d61f80fd174a6b2cf8f2a6c3f8b50a5f7c1d9e198290599"

RPROVIDES:${PN} += "cmake-Qt6Quick3D \
cmake-Qt6Quick3DTools \
pkgconfig-Qt6Quick3D \
qt6-quick3d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3D6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DRuntimeRender \
qt6-quick3d"

inherit rpm
