SUMMARY = "Robots-like game by KDE"
DESCRIPTION = "Killbots is a turn-based game of evading 'killer' robots on a board. \
Robots home in on the player, but can crash into other robots or \
debris, rendering them inert. The player has to strategically move \
and can optionally use teleportation to a random location."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "killbots-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8e18e06f1ffa0b5768f5547a41a1e31413d9fefcb24bc04ac37cf3fa94a280a5d9dfb95f5b8f396767e786d6293f1beedba7939d3444716526d8d7dd8768d730"

RPROVIDES:${PN} += "killbots \
killbots5"

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
