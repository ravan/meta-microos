SUMMARY = "Qt 6 WebViewQuick library"
DESCRIPTION = "The Qt6 WebViewQuick library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WebViewQuick6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6fc3385d1cb0ce93599fda7de5609aea1ebc13f2de7af5204d7ce7d7809be21fe550ee84cace528e401a39cd541715c1e2e6b37afd8ec6d3dacbcf98bd3df87a"

RPROVIDES:${PN} += "libQt6WebViewQuick.so.6 \
libQt6WebViewQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebView.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
