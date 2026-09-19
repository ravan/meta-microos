SUMMARY = "Libreswan support for plasma6-nm"
DESCRIPTION = "Libreswan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-libreswan-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "bca57cbaa9ef6daedb5460a3ec697a74a143d9e76a843491ea9f0e5c9554b664590170b11fb1258b0b11378e7fd4ae198fddebfe75dfeaa55a550e55f98b3bab"

RPROVIDES:${PN} += "NetworkManager-libreswan-frontend \
plasma-nm-openswan \
plasma-nm5-libreswan \
plasma-nm5-openswan \
plasma6-nm-libreswan"

RDEPENDS:${PN} += "NetworkManager-libreswan \
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
