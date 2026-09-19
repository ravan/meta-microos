SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DRuntimeRender that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3druntimerender-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "64ba29c1e0dc50ca69464e029ad95b36d62cd7aae8a3f8da3887bbf86f6a40fef19ec507edcfcb24bc552885ce36aec18b91e368a62b4369a4ac5c5470ca6953"

RPROVIDES:${PN} += "cmake-Qt6Quick3DRuntimeRenderPrivate \
qt6-quick3druntimerender-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DRuntimeRender \
cmake-Qt6Quick3DUtilsPrivate \
cmake-Qt6QuickPrivate \
cmake-Qt6ShaderToolsPrivate"

inherit rpm
