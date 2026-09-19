SUMMARY = "Rockbox Firmware Manager"
DESCRIPTION = "Firmware manager for Rockbox MP3 players."
LICENSE = "GPL-2.0-only"

PV = "1.5.1"

RPM_NAME = "rbutil-1.5.1-1.5.aarch64.rpm"
RPM_HASH = "0b2e2deb041dc4eae81df35df54e554c8f3ffc274b395e4d8f06d65b36692a50c006c87ef7eb5eb6692859af34bb54c9d17c2be0d410c8390cde1cc118f08664"

RPROVIDES:${PN} += "rbutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libspeex.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
