SUMMARY = "A classic falling blocks game"
DESCRIPTION = "KBlocks is the KDE version of the classic falling blocks game."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kblocks-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a0e1f9ba67a2d2fc0764223f52b31fd49b53b47531f540382e85f1164a6e4712d6767cc096fc20b3c58d7b886650163fc403ddfa8e0869f30dbb2f459d1f4887"

RPROVIDES:${PN} += "kblocks \
kblocks5"

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
libQt6Network.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
