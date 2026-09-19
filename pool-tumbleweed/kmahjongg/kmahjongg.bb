SUMMARY = "Mahjongg game"
DESCRIPTION = "KMahjongg is a clone of the well known tile based patience game of the \
same name. In the game you have to empty a game board filled with piece \
by removing pieces of the same type."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kmahjongg-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "fe7472151cdebb3897239fbd7dbe05ee31088bcdfb207fee6e401692cdbca0f9e8aaa5d43b6fe7d7ec3e48f2d6edca9da15d9d3d029c87046c11b34d1c976652"

RPROVIDES:${PN} += "kmahjongg \
kmahjongg5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKMahjongg6.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
