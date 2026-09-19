SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes the Widgets library, providing \
GUI, MIDI related, components for C++/Qt5 programs."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "libdrumstick-widgets2-2.11.1-1.1.aarch64.rpm"
RPM_HASH = "f66b1b213ac2dfd88b1e473e480cdeb5209cffd5d0c1b1a77bddf086c686b20342b85ecbc7bf3093be7c6e0bd48a9f78959957a82cb434a46be3c2442defa83a"

RPROVIDES:${PN} += "libdrumstick-widgets \
libdrumstick-widgets.so.2 \
libdrumstick-widgets2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdrumstick-rt.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
