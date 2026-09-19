SUMMARY = "Tactical game"
DESCRIPTION = "Klines is the KDE version of the russian game Lines where you have to \
align five game pieces of the same colour in one line to remove them \
from the game board. Similar to tetris you fight new pieces appearing."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "klines-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e1ae97134c71761a34ba5460553197ca70e821453540973662bc6a54b718b8875cfcbc8c0a71305a46f180003b0074eb39650b7f13401751290f93f9ad6e4bc9"

RPROVIDES:${PN} += "klines \
klines5"

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
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
