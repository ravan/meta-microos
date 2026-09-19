SUMMARY = "Simon Says Game"
DESCRIPTION = "A memory enhancement game."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "blinken-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "082d0cea138fc07f9bb281d6d4ad17a5fad8d1718d2b869af7f9f1ce990a2a07848cba3a68adea47bb2451789cd5352cacd68035bbef9a0511170236d388845f"

RPROVIDES:${PN} += "blinken \
blinken5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
