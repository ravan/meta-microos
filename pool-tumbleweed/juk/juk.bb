SUMMARY = "Jukebox"
DESCRIPTION = "Jukebox and music manager by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "juk-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "79c8d90a8755a0ac992a6c8ef4865caece26f672ddeb49fdd175d0b879ad27b14482a6b5bf62337497616d0d742b0b75a7ba4f34c513c5930c3bf190f000dcd7"

RPROVIDES:${PN} += "juk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextWidgets.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtag.so.2"

inherit rpm
