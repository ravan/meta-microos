SUMMARY = "VPN support for plasma6-nm"
DESCRIPTION = "Iodine (VPN through DNS tunnel) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-iodine-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "42097cc96392e44f42ced9b171b46a9ef89a255fffeb73e8f402f5e967a64df84c5ff4b7bfff4237cf47e5997231476ce7f2ac2d30a110cdb2e88799155accb9"

RPROVIDES:${PN} += "NetworkManager-iodine-frontend \
plasma6-nm-iodine"

RDEPENDS:${PN} += "NetworkManager-iodine \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma6-nm"

inherit rpm
