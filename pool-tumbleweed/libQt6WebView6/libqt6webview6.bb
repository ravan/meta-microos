SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WebView6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "04f197f54dca14731abb3b39ac155d2c2a9948833a502c54b11199b709a6853729ad60071f942d34aeed151a470150d199ac2a8a0b6d73252b1fb31a348129ca"

RPROVIDES:${PN} += "libQt6WebView.so.6 \
libQt6WebView6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
