SUMMARY = "RGB driver for Corsair keyboard and mice"
DESCRIPTION = "ckb is a driver for Corsair keyboards and mice. It brings the \
features of their proprietary CUE software to the Linux operating \
system. This project supports much of the same functionality, \
including full RGB animations."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.6.2"

RPM_NAME = "ckb-next-0.6.2-1.7.aarch64.rpm"
RPM_HASH = "6c45ee3308c8d45c54d443310c8fc42163d4a6d537b1f9dc93ea8791beaaa7a6d6a858f1b383701ce73e0414bb1a93b8b81a6cf3c068ffe43a37ad638ffb92d6"

RPROVIDES:${PN} += "ckb \
ckb-next"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpulse.so.0 \
libquazip1-qt6.so.1.7 \
libstdc++.so.6 \
libudev.so.1 \
libxcb-ewmh.so.2 \
libxcb-screensaver.so.0 \
libxcb.so.1 \
systemd"

inherit rpm
