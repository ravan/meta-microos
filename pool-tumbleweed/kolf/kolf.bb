SUMMARY = "Miniature golf game"
DESCRIPTION = "Kolf is a miniature golf game by KDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kolf-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e61fa4948a74b891af636ba8e398f50ac7587fe6f0f49a4ad1819dc6a9c6fc64e2cc4c0d791e3ea7583ab2f0ed0f7b7cfee0917c719ae20ec1d37ee9fb46c888"

RPROVIDES:${PN} += "kolf"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
