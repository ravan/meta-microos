SUMMARY = "Qt 5 Gamepad Library"
DESCRIPTION = "Qt Gamepad is an add-on library that enables Qt applications to \
support the use of gamepad hardware. The module provides both QML and \
C++ interfaces."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Gamepad5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "a6e7d022519140aef2324785a5063c87595682ac42bb4dfa98db8136cca9512dc3afa2ee1b3a35f08ebd368decd7f4b06d3ea378b1ea8af14dc337bbbdce9f1d"

RPROVIDES:${PN} += "libQt5Gamepad.so.5 \
libQt5Gamepad5 \
libevdevgamepad.so \
libsdl2gamepad.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libSDL2-2.0.so.0 \
libc.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
