SUMMARY = "Non-ABI stable API for the Qt 6 Quick3D library"
DESCRIPTION = "This package provides private headers of libQt6Quick3D that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3d-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "094b52dec1f52c3951a6f52b1ddc668afd551c732eff997db671d12697a17dcd89768ecbf116c1c1e7373ca173b2e1bf8221227880cb3cb7a1bf6a74f50ddb75"

RPROVIDES:${PN} += "cmake-Qt6Quick3DPrivate \
qt6-quick3d-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DRuntimeRenderPrivate \
cmake-Qt6QuickPrivate"

inherit rpm
