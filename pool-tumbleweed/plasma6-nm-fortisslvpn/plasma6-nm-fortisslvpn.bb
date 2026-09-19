SUMMARY = "FortiGate SSL VPN support for plasma6-nm"
DESCRIPTION = "FortiGate SSL VPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-fortisslvpn-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "011fc89d036e81ad3c235ebe2c6b7b665b258c51edc2af29e4fa40c09ee4f1bbb5177c78e337576762122d2882387f128e5df8775010b31a744c05b1ade2744a"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn-frontend \
plasma6-nm-fortisslvpn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma6-nm"

inherit rpm
