SUMMARY = "Logic game with elements of hide-and-seek"
DESCRIPTION = "KBlackbox is a graphical logical game, inspired by emacs's blackbox. It \
is a game of hide and seek played on an grid of boxes."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kblackbox-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ee8b9f097976927c7606bc098557d3445cd4877fffced683e07696e0755a2cb3652bd8d43e09b6b59cdd2500cf9401fddaaa2f9c2dcbabf0ea0113d0049e613c"

RPROVIDES:${PN} += "kblackbox \
kblackbox5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
