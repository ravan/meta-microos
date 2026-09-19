SUMMARY = "Qt 6 Quick3DPhysics library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dphysics-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2f03d8efa780a9ce9230c53fa152a7632819705d43b69169b443fdb203186adfd7f20b583243b255e0d11e18a98cdef5bcee4c87b059b6e190615cca189646b4"

RPROVIDES:${PN} += "cmake-Qt6Quick3DPhysics \
pkgconfig-Qt6Quick3DPhysics \
qt6-quick3dphysics-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
libQt6Quick3DPhysics6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D"

inherit rpm
