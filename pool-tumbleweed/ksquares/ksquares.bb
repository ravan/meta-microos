SUMMARY = "'Dots and boxes' board game"
DESCRIPTION = "KSquares is an implementation of the popular paper-based game \
squares, better known as 'La Pipopipette' in its original French \
form, or 'Dots and Boxes' in English. One must draw lines to complete \
squares, and the player with the most squares wins. This \
implementation can be played with up to 4 players, any number of \
which may be controlled by the computer."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ksquares-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "64e5290413985456ba0e6e4fcea2e1de0d4ab39068b7845e392858a542337dd8345bf8b9995342a8e5e4e0928897a6f5ba718c6bc029eddfc99e691cfefa2aac"

RPROVIDES:${PN} += "ksquares \
ksquares5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
