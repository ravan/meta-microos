SUMMARY = "vpnc support for plasma6-nm"
DESCRIPTION = "vpnc plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-vpnc-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "57a745bcaa92b2c0d0fae8859094001945f2960884f22e0325263124da2e8aabc46602feb55dcb19d6756e259cd36e409cd79cda3dbf8275474d7e033c932c2b"

RPROVIDES:${PN} += "NetworkManager-vpnc-frontend \
plasma-nm-vpnc \
plasma-nm5-vpnc \
plasma6-nm-vpnc"

RDEPENDS:${PN} += "NetworkManager-vpnc \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libnm.so.0 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma6-nm"

inherit rpm
