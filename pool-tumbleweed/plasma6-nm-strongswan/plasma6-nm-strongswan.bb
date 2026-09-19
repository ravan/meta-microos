SUMMARY = "strongSwan support for plasma6-nm"
DESCRIPTION = "strongSwan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-strongswan-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "6248a24430eb4e9f3f6ae8b0e96686b267bc46908f829c765c0dbdcaa807b5394a4ed776fa38316e378f43753fa4f73f0787f20506e87c539803b39c22f4f4e9"

RPROVIDES:${PN} += "NetworkManager-strongswan-frontend \
plasma-nm-strongswan \
plasma-nm5-strongswan \
plasma6-nm-strongswan"

RDEPENDS:${PN} += "NetworkManager-strongswan \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma6-nm"

inherit rpm
