SUMMARY = "Dolphin, a GameCube and Wii Emulator"
DESCRIPTION = "Dolphin is an emulator for two Nintendo video game consoles, GameCube and the Wii. \
It allows PC gamers to enjoy games for these two consoles in full HD with several \
enhancements such as compatibility with all PC controllers, turbo speed, \
networked multiplayer, and more. \
Most games run perfectly or with minor bugs."
LICENSE = "(Apache-2.0 | MIT) & BSD-2-Clause & libpng-2.0 & GPL-2.0-or-later"

PV = "2606a"

RPM_NAME = "dolphin-emu-2606a-1.1.aarch64.rpm"
RPM_HASH = "f80ac1893426ee1834ee04abd9c204266de6d806ce1cfe979b776248d43df9a6b275345c06a8ae441f968d71b4410eea9944ae27971a9a6b5a1033f89b9dee7c"

RPROVIDES:${PN} += "dolphin-emu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libSDL3.so.0 \
libX11.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libasound.so.2 \
libbluetooth.so.3 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libenet.so.7 \
libevdev.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libglslang.so.16 \
libhidapi-hidraw.so.0 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libminiupnpc.so.21 \
libminizip-ng.so.4 \
libpugixml.so.1 \
libpulse.so.0 \
libsfml-network.so.3.0 \
libspeexdsp.so.1 \
libspng.so.0 \
libstdc++.so.6 \
libudev.so.1 \
libusb-1.0.so.0 \
libxxhash.so.0 \
libz.so.1 \
libzstd.so.1 \
nintendo-gamecube-wiimote-udev-rules"

inherit rpm
