SUMMARY = "wxWidgets SDL Plugin"
DESCRIPTION = "SDL based sound plugin for the wxWidgets cross-platform GUI."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "wxWidgets-3_2-plugin-sound_sdlu-3_2-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "c62f72d954518cee879c93e3d647795e7cdfe5733e1ebdf313c8ec39b25e00523aa4504d2f3ee69373255dd488942b7c296416c84ed422ec1dc10b2446f25da4"

RPROVIDES:${PN} += "wxWidgets-3-2-plugin-sound-sdlu-3-2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
