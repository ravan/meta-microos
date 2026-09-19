SUMMARY = "Qt6 Quick3DAssetUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dassetutils-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "71c89a7ee39e70f2485f6b0c98e3c1c543be005524d812f60dfe57a46611c07ffdf4a247a0704717799f14027375a22d8f78a3372fa9e6a55a9fda78073dcf37"

RPROVIDES:${PN} += "cmake-Qt6Quick3DAssetUtils \
pkgconfig-Qt6Quick3DAssetUtils \
qt6-quick3dassetutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DAssetImportPrivate \
cmake-Qt6Quick3DPrivate \
cmake-Qt6Quick3DRuntimeRender \
cmake-Qt6Quick3DRuntimeRenderPrivate \
cmake-Qt6QuickTimeline \
libQt6Quick3DAssetUtils6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
