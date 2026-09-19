SUMMARY = "Five-in-a-row Board Game"
DESCRIPTION = "Bovo is a Gomoku (Connect Five, Five in a row, X and O, etc) game by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "bovo-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a04cf5ae590efc5122531737eaa8fd9268210f5f1625fd3a795d478013f28cb3f9d0c57625b3d58e297e9e658e2c8e084a787071904b7711f2822b8ed1a609c8"

RPROVIDES:${PN} += "bovo \
bovo5"

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
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
