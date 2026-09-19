SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes a class for managing realtime MIDI input/output backends."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "libdrumstick-rt2-2.11.1-1.1.aarch64.rpm"
RPM_HASH = "f6d412e59270007ca2671e117b1192a19241e914c9aa0701f972581ef98243896650159e4b52ea5e4886fa4653b902ecd98dd09cb2757f02edb2e11ed67bdf2c"

RPROVIDES:${PN} += "libdrumstick-rt.so.2 \
libdrumstick-rt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libdrumstick-rt2-plugins \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
