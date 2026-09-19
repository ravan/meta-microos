SUMMARY = "L2TP support for plasma6-nm"
DESCRIPTION = "Layer Two Tunneling Protocol (L2TP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-l2tp-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "19990fd392405c42125cd8039b9c2ef69ed98578c6b3960912ffcd2968a5ac0043d86be0acc095958671ece6031fba06a0a799bad09b1c9b58e1ef6d44168e6c"

RPROVIDES:${PN} += "NetworkManager-l2tp-frontend \
plasma-nm-l2tp \
plasma-nm5-l2tp \
plasma6-nm-l2tp"

RDEPENDS:${PN} += "NetworkManager-l2tp \
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
libplasmanm-editor.so \
libstdc++.so.6 \
plasma6-nm"

inherit rpm
