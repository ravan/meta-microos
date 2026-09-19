SUMMARY = "Qt6 Quick3DRuntimeRender library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3druntimerender-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f0d8da06be249eab0aaccca7a77f16a0d5179c1368442766aa1ec9410d54d0f097c8b6fb9290b900c570f3ad91678087d70651d90cbffdb5d69a95b37df183ae"

RPROVIDES:${PN} += "cmake-Qt6Quick3DRuntimeRender \
pkgconfig-Qt6Quick3DRuntimeRender \
qt6-quick3druntimerender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Concurrent \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Quick3DUtils \
cmake-Qt6ShaderTools \
libQt6Quick3DRuntimeRender6 \
pkgconfig-Qt6Concurrent \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DUtils \
pkgconfig-Qt6ShaderTools"

inherit rpm
