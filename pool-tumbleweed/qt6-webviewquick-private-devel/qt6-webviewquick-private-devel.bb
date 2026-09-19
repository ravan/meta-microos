SUMMARY = "Non-ABI stable API for the Qt 6 WebViewQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebViewQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webviewquick-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e23bade4d07c96477fc6151ee60b488a475c287ea7d18e2fff8b63840f073bc801b407bd1e2ff2f015b026df8d4546923bf132fbf1cb6d8dc313ed36e51cd98f"

RPROVIDES:${PN} += "cmake-Qt6WebViewQuickPrivate \
qt6-webviewquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebViewQuick"

inherit rpm
