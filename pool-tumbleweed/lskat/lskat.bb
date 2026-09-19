SUMMARY = "German Skat game"
DESCRIPTION = "Lieutenant Skat is a nice two player card game which follows the rules \
for the German game (Offiziers)-Skat. The program includes many \
different carddecks to choose. A computer opponent can play for any of \
the players."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "lskat-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "711a789bbb4d11564845b4bc2d38261fefc18c52c06e5ae9fe83f8ce948f3820a75785e18759234535b470c537436f28e3624da37771c1a21e158adb4fd31803"

RPROVIDES:${PN} += "lskat \
lskat5"

RDEPENDS:${PN} += "kdegames-carddecks-default \
ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
