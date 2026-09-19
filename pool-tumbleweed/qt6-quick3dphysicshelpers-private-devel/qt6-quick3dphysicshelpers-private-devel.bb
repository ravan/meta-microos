SUMMARY = "Qt 6 Quick3DPhysicsHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dphysicshelpers-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e094026074e7397d227420be881d52865cd56e1efb80057169e5ebc9e0e7eb032d21aff93b4811db4a88b65cd1f4e04ea31da47a1c6dfd02bedfd9a401d617d2"

RPROVIDES:${PN} += "cmake-Qt6Quick3DPhysicsHelpers \
cmake-Qt6Quick3DPhysicsHelpersPrivate \
pkgconfig-Qt6Quick3DPhysicsHelpers \
qt6-quick3dphysicshelpers-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DPhysicsPrivate \
libQt6Quick3DPhysicsHelpers6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D"

inherit rpm
