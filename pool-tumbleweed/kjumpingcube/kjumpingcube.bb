SUMMARY = "Tactical board game"
DESCRIPTION = "KJumpingCube is a tactical one or two-player game. The playing field \
consists of squares that contains points which can be increased. By \
this you can gain more fields and finally win the board over."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kjumpingcube-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ee0f7e8571ffadc870f4c7bb4b152b108ee518b245357c0a99f55145d9ae18198a41b721eff02696310950305a0986381efa5b5e1b97c5f317b7a8dd02b19058"

RPROVIDES:${PN} += "kjumpingcube \
kjumpingcube5"

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
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
