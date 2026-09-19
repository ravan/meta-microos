SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetUtils that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dassetutils-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "212f65a7df18445c14e040339723bbaf9327c1105a4da4232c42757175d73a4f5ff227165b230a56ccae2b724d1c55b04e04ad63a0c5c76c76dcf1877cd7865e"

RPROVIDES:${PN} += "cmake-Qt6Quick3DAssetUtilsPrivate \
qt6-quick3dassetutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6Quick3DAssetImportPrivate \
cmake-Qt6Quick3DAssetUtils \
cmake-Qt6Quick3DPrivate \
cmake-Qt6Quick3DRuntimeRenderPrivate \
cmake-Qt6QuickTimelinePrivate"

inherit rpm
