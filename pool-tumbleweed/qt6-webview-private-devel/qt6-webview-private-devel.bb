SUMMARY = "Non-ABI stable API for the Qt 6 WebView library"
DESCRIPTION = "This package provides private headers of libQt6WebView that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webview-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b551981b40b53d72265f4d80058ea63ab122602088c7a7bc79d923f49b00384dc09472b3c56808cc7b380a3393097ca55b2a5632eeb6d2b53d82872fca51b9cf"

RPROVIDES:${PN} += "cmake-Qt6WebViewPrivate \
qt6-webview-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6WebView"

inherit rpm
