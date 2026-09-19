SUMMARY = "Graphical program used to map keyboard keys and mouse controls to a game-pad"
DESCRIPTION = "Antimicrox is a graphical program used to map keyboard keys and mouse \
controls to a gamepad. This program is useful for playing PC games using \
a gamepad that do not have any form of built-in gamepad support. \
However, you can use this program to control any desktop application with \
a gamepad; on Linux, this means that your system has to be running an \
X environment in order to run this program. \
 \
This application is continuation of project called AntiMicro, \
which was later abandoned and revived by juliagoda."
LICENSE = "GPL-3.0-or-later & Zlib"

PV = "3.6.1"

RPM_NAME = "antimicrox-3.6.1-1.2.aarch64.rpm"
RPM_HASH = "0c7d6315f22705c3041a53ae771c4d54e4f77fbea37482cac87c77d5937a1ee036637692498a9bc6b880ee73da06ffe51d8c1e116e90421e12d5efda867879f0"

RPROVIDES:${PN} += "antimicrox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
