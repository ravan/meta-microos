SUMMARY = "Qt 6 UiTools library"
DESCRIPTION = "This package contains the Qt 6 UiTools library."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "libQt6UiTools6-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "859ce1446b64a3965ff8904f190e4d8770488f9a9809669c4f9ad4be0dbf1155ed583023c8595e8b83ff9b526af47036356f664a36b9250e18b63e8dcaa8d7bf"

RPROVIDES:${PN} += "libQt6UiTools.so.6 \
libQt6UiTools6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
