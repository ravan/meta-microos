SUMMARY = "Risk-like game by KDE"
DESCRIPTION = "KsirK is a computerized version of a well known strategy game."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ksirk-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5297e93c528deab5104be491f46d00feddb19e7b7e3007ebf0c5278986b10f70e96e4ea49ebfcb19cdb69c4b27db4f808a208f8cdce0d667f37e003b0f0f6cf1"

RPROVIDES:${PN} += "ksirk \
ksirk5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKDEGames6Private.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
