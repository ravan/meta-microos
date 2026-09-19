SUMMARY = "Yahtzee-like Game"
DESCRIPTION = "Kiriki is the KDE version of the dice game Yahtzee where you roll dices \
to get higher scores in several combinations"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kiriki-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3f15fe9a0e5c8738b45f368d833f34b18886e03ebb18cb7d9c05c2f1c3862cc285ab1358830bdb8826d6722b2f5af1f45078dcde4815974b3df2c9a0fe72f46a"

RPROVIDES:${PN} += "kiriki \
kiriki5"

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
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
