SUMMARY = "Patience card game"
DESCRIPTION = "KPatience is a collection of various patience games known all over the \
world. It includes Klondike, Freecell, Yukon, Forty and Eight and many \
more. The game has nice graphics and many different carddecks."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpat-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "373ba37c2cc54b3452aaae157d47577c40cfe5978f52689084553844f2e0caf961fa02a8c61268d09ff1ad57b7a9d64578e760678e9b9b0356920668a32ef503"

RPROVIDES:${PN} += "kpat \
kpat5 \
libkcardgame.so"

RDEPENDS:${PN} += "kdegames-carddecks-default \
ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libblack-hole-solver.so.1 \
libc.so.6 \
libfreecell-solver.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
