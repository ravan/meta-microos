SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DPhysics library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DPhysics that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dphysics-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0fa73dc5bbe1722a8cc18706438ee07ac368c937d87091559183185af5fa76370c64aea22d24d12f37dc6d4d4ffd61d8b253e8a7f0f3abebd7a19c8c3ce2b034"

RPROVIDES:${PN} += "cmake-Qt6Quick3DPhysicsPrivate \
qt6-quick3dphysics-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DPhysics \
cmake-Qt6QuickPrivate"

inherit rpm
