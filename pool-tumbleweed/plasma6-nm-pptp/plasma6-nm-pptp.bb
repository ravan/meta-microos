SUMMARY = "PPTP support for plasma6-nm"
DESCRIPTION = "Point-To-Point Tunneling Protocol (PPTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-pptp-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "088f6e87fd0721c83fe6ee617debecb3ba92dd7bbab679760acca49f15e6468b3e29b81512cc6930c80f595c7c0947531c99f977bb267c7e1307628a45d76c43"

RPROVIDES:${PN} += "NetworkManager-pptp-frontend \
plasma-nm-pptp \
plasma-nm5-pptp \
plasma6-nm-pptp"

RDEPENDS:${PN} += "NetworkManager-pptp \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
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
