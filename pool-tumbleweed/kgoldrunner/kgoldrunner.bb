SUMMARY = "Action & Puzzle Solving Game"
DESCRIPTION = "KGoldrunner is a game of action and puzzle solving"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kgoldrunner-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d994f0f8bb90c60e9f5e9dc22b2eba050000a9f0e9cfcc0eeec3270563d439c0123d7f2c5f46066b28e7f22f1ec68a9a2d5ddad808acdc236e1aed0531b1de20"

RPROVIDES:${PN} += "kgoldrunner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
