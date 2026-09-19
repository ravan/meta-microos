SUMMARY = "Strategic board game"
DESCRIPTION = "Klickety is an adaptation of the Clickomania and SameGame games."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "klickety-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4a69c08e4b115b9c0cac6f50009860bf531f7b27420a021c007ccc9857a8eab0e6a1daad7131fb9d38f0cc9cd090d56669400bbd27cf99df980fe783b7a5ea0a"

RPROVIDES:${PN} += "klickety \
klickety5"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
