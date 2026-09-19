SUMMARY = "Game involving the invasion of cities with a plane"
DESCRIPTION = "Bomber is a single player arcade game. The player is invading various cities in \
a plane that is decreasing in height. \
 \
The goal of the game is to destroy all the buildings and advance to the next \
level. Each level gets a harder by increasing the speed of the plane and the \
height of the buildings."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "bomber-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3715312dcfea50c12252bb6c36928d651eb1d3c3bbc55b95fc223fb1c35550602cf1d0ee793f7bf9e1d461f844aed84a8d615ee12f4b75851a3e293842d36221"

RPROVIDES:${PN} += "bomber \
bomber5"

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
libstdc++.so.6"

inherit rpm
