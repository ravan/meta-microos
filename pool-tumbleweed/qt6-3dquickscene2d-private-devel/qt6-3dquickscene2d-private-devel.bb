SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "This package provides private headers of libQt63DQuickScene2D that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickscene2d-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "08c637b7f85cd0fc0e95ba68c2aefb542a406a5e3581379d1ca4cdafe83d164d3a1acb95024364837d98f9d0f435881c4265e6c9e05c18fddb183503a1a924b6"

RPROVIDES:${PN} += "cmake-Qt63DQuickScene2DPrivate \
qt6-3dquickscene2d-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DQuickPrivate \
cmake-Qt63DQuickScene2D \
cmake-Qt63DRenderPrivate \
cmake-Qt6CorePrivate \
cmake-Qt6QmlPrivate"

inherit rpm
