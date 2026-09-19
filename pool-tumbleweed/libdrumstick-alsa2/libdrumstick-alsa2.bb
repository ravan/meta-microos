SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes the ALSA Sequencer library classes, providing MIDI \
recording and playback functionality to C++/Qt5 programs."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "libdrumstick-alsa2-2.11.1-1.1.aarch64.rpm"
RPM_HASH = "2539d3997f3ec07d66b5444560e0890e4b9daadb556eedd6dccf365542cd9da34144af15f633ad659df099cd832b94b7b0e6cfa14fe840589bdb2e435db88da9"

RPROVIDES:${PN} += "libdrumstick-alsa.so.2 \
libdrumstick-alsa2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
