SUMMARY = "Non-ABI stable API for the Qt 6 3DRender library"
DESCRIPTION = "This package provides private headers of libQt63DRender that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3drender-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7c6e5acb6fc38ed5b7f2500239c9c3510242aff55f6474b8540cbd664715479a1055ede473e8a9271dfa7de8268f5c07d12e9d8278f605b661dafc5f88c96c1f"

RPROVIDES:${PN} += "cmake-Qt63DRenderPrivate \
qt6-3drender-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DRender \
cmake-Qt6Concurrent \
cmake-Qt6CorePrivate"

inherit rpm
