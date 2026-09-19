SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickScene3D library"
DESCRIPTION = "This package provides private headers of libQt63DQuickScene3D that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickscene3d-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "65d6f447fc7a64288e391f4533be9daee3d927f14e097014b19f9b7df9c59c8de249fe3be71a8f8086de514399ba33bdaf3cc94a181a3251fff8fd74d64139c2"

RPROVIDES:${PN} += "cmake-Qt63DQuickScene3DPrivate \
qt6-3dquickscene3d-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DQuickScene3D \
cmake-Qt63DRenderPrivate \
cmake-Qt6CorePrivate \
cmake-Qt6QmlPrivate"

inherit rpm
