SUMMARY = "Development files for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "Development files for the Qt 6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webenginewidgets-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9bd09dd382c2448499de5106b38235e2fe0ed763d3e8f9adf6edde1ca64b0bc76f5e202c76f6225ad167a837aa4127df1e3d6c66cc7781e1611429d3ab8fb990"

RPROVIDES:${PN} += "cmake-Qt6WebEngineWidgets \
pkgconfig-Qt6WebEngineWidgets \
qt6-webenginewidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6PrintSupport \
cmake-Qt6Quick \
cmake-Qt6QuickWidgets \
cmake-Qt6WebEngineCore \
cmake-Qt6Widgets \
libQt6WebEngineWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6PrintSupport \
pkgconfig-Qt6WebEngineCore \
pkgconfig-Qt6Widgets"

inherit rpm
