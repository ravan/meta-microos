SUMMARY = "Preset-oriented graphical launcher for Doom engine source ports"
DESCRIPTION = "Doom Runner is a graphical launcher for Doom/Heretic/Hexen source ports such as \
GZDoom, Chocolate/Crispy Doom, International Doom and more. \
It supports creating presets for each game (with mods) allowing for one-click \
switching between them."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.2"

RPM_NAME = "DoomRunner-1.9.2-2.3.aarch64.rpm"
RPM_HASH = "50db488656da50fcbc91cecc46e69854f7e894b1244a43112263cc96ca4adb4807fda6c6dede04c6e517094c8894d5697073144f304393ef0505a07005313e9a"

RPROVIDES:${PN} += "DoomRunner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libminizip.so.1 \
libstdc++.so.6"

inherit rpm
