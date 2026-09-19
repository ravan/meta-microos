SUMMARY = "Kollision game"
DESCRIPTION = "KDE version of a classic arcade game"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kollision-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "adc13797ed429f58df6a18bc4b3118ef5e17013d3aed332c2e8f3448cd6111468a42591d35fd99b1b685dd0d63a2a2ef724af9b57b186d15ad486bcb5a0a45e6"

RPROVIDES:${PN} += "kollision \
kollision5"

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
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
