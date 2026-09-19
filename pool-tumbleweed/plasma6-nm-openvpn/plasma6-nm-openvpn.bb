SUMMARY = "OpenVPN support for plasma6-nm"
DESCRIPTION = "OpenVPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-openvpn-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "ac9a37fe06e3742d0b0bdeb62e54aacb07821af64a6182796d65a7c1c060b8fabec66eee7198a17367c4a384a0cfc4d9e9cee1044c4fd7753beeb980d1f3a7ea"

RPROVIDES:${PN} += "NetworkManager-openvpn-frontend \
plasma-nm-openvpn \
plasma-nm5-openvpn \
plasma6-nm-openvpn"

RDEPENDS:${PN} += "NetworkManager-openvpn \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libnm.so.0 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma6-nm"

inherit rpm
