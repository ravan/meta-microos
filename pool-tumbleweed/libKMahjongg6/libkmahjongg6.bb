SUMMARY = "Library for Mahjongg tiles"
DESCRIPTION = "Common code, backgrounds and tile sets for games using Mahjongg tiles."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKMahjongg6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4cf9df1db8cfb8a1fc3a6e574a923156e73b416b1fb8e6582104a96fbe561a53ce919977fe7838aa61ff5a1584a7d630525e7fa6d0fa70a68f2687dfeade6af7"

RPROVIDES:${PN} += "libKMahjongg6 \
libKMahjongg6.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkmahjongg \
libstdc++.so.6"

inherit rpm
