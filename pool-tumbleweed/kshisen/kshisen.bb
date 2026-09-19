SUMMARY = "Shisen-Sho Mahjongg-like game"
DESCRIPTION = "Shisen-Sho (KShishen) is a game similar to Mahjongg. The object of the \
game is to remove all tiles from the field. This is done by removing \
two tiles with of the same type until no tile is left."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kshisen-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4c630e9e32e7c55ed929e0815b184fbb50fb5236b9b7d2f0ec41ae8b575fdc10494bc0db12758cced90b3d53a151071fa8a95b91d0424ad5b5122a781da8982a"

RPROVIDES:${PN} += "kshisen \
kshisen5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKMahjongg6.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
