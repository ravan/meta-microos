SUMMARY = "Development files for the Qt 6 3DQuickScene3D library"
DESCRIPTION = "Development files for the Qt 6 3DQuickScene3D library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickscene3d-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "186d9a17b39d3e0b80c016bf046eec18b0a1e60840a1a8146ec33a1b1632ddd84760a1d335a32a669f1fb517ff24ae182ad58925c2b913a0f1e636374cc72a8b"

RPROVIDES:${PN} += "cmake-Qt63DQuickScene3D \
pkgconfig-Qt63DQuickScene3D \
qt6-3dquickscene3d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickScene3D6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Quick"

inherit rpm
