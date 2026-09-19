SUMMARY = "Arcade and Puzzle 2D Game in which you have to break all the target pieces"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-0.3.8-2.22.aarch64.rpm"
RPM_HASH = "56bf1504af5eb4401aa403aec41e61ecd098f71f1780d7f3f3c8eaab8037cf77d5ea04cff2c3c94afb23bda8197fbbc8d85e218dd1c58984ca8725b00e53b1fc"

RPROVIDES:${PN} += "jag"

RDEPENDS:${PN} += "jag-data \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
