SUMMARY = "Space Arcade game"
DESCRIPTION = "KSpaceduel is a space arcade game for two players. However, one player \
can be controlled by the computer. Each player controls a satellite \
that flies around the sun. While doing so both players try not to \
collide with anything but shoot at the other space ship."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kspaceduel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "06b1ce6e20749d977e760dc7fe118af599524a203f94cd43881051234a25e4aeb9f507c6f4b6e117381f908de26476a74817b22b7c3caf8d66c70814cb49835a"

RPROVIDES:${PN} += "kspaceduel \
kspaceduel5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
