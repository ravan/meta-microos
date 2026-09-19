SUMMARY = "Jigsaw puzzle game"
DESCRIPTION = "Palapeli is a jigsaw puzzle game. Unlike other games in that genre, you are not \
limited to aligning pieces on imaginary grids. The pieces are freely moveable. \
Also, Palapeli features real persistency, i.e. everything you do is saved on \
your disk immediately."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "palapeli-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8cc748fad43ebbb73decff4d0653de82bb7a45ae69378c2fd676f25383fbe6991298a75d9190c34d8802016c92738931f9b9da066765698a3963b53ac6570e39"

RPROVIDES:${PN} += "libpala.so.0 \
palapeli"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
palapeli-data"

inherit rpm
