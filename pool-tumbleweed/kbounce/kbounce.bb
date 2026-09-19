SUMMARY = "Bounce ball game"
DESCRIPTION = "Your task in KBounce (Jezz Ball) is to catch several moving balls in a \
rectangular game field by building walls. The motivation consists of \
finding new and advanced strategies to catch as many balls as possible."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kbounce-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d81cb68c4ea96db5d930bb339510c4f74fbc54b1b09dfec4592e6bbb8550bde561437517315223eaf989dd82d3124b7f9b0562db860706fcb49eb284c91a7b5f"

RPROVIDES:${PN} += "kbounce \
kbounce5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
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
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
