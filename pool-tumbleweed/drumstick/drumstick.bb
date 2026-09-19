SUMMARY = "MIDI Sequencer C++ Library Bindings"
DESCRIPTION = "This package includes test and example programs for drumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "drumstick-2.11.1-1.1.aarch64.rpm"
RPM_HASH = "e1798f75e64bb0668678f975984e2545e5fd09fd80bd7026da0cf9d574697a9fe1ead442bfb16025c69fc937e9cfd3dd643f92c116a0f2766e0ff0b8c4a0f797"

RPROVIDES:${PN} += "drumstick"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdrumstick-alsa.so.2 \
libdrumstick-file.so.2 \
libdrumstick-rt.so.2 \
libdrumstick-widgets.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
