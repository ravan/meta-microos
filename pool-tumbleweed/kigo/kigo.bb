SUMMARY = "Traditional Chinese Boardgame by KDE"
DESCRIPTION = "Traditional Chinese Boardgame."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kigo-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6cc67f8c006747c99fdf329db887654400c22ed8b220f9754976bbb5e427484b2676599b06b1e6280b0d1904467693622a26b6b936a236d34943447894901dc0"

RPROVIDES:${PN} += "kigo \
kigo5"

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
libKF6KIOWidgets.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
