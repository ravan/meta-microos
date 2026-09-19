SUMMARY = "Galactic strategy game"
DESCRIPTION = "This the KDE version of Gnu-Lactic Konquest, a multi-player strategy \
game. The goal of the game is to expand your interstellar empire across \
the galaxy."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konquest-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "22edd9efe1a89103b722d937e26155080f0ef29de3ec1915d5cce77c213165d8d137b9796ae87319ff80b02440229b06f3e158460c1b09e7ca60d8d89f95e95c"

RPROVIDES:${PN} += "konquest \
konquest5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6StateMachine.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
