SUMMARY = "Qt 6 NetworkAuth library - Development files"
DESCRIPTION = "Development files for the Qt 6 NetworkAuth library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-networkauth-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7abb28e5ad81e56d024dbc6817cfa41ce8b3416b832c93f9411907eb09e4b77f78c077a429d4555418df85c60d4274c1010fb3aba53b64e27e4e45e1f8397847"

RPROVIDES:${PN} += "cmake-Qt6NetworkAuth \
pkgconfig-Qt6NetworkAuth \
qt6-networkauth-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6NetworkAuth6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
