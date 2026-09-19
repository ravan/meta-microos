SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This package contains input/output plugins for libdrumstick-rt2."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "libdrumstick-rt2-plugins-2.11.1-1.1.aarch64.rpm"
RPM_HASH = "b8074b2f8e5fa9d0070e08584a1f3287a5b3cd17346a7fa43a8ec4c0272e09d194d9a4a7f4103d2ab14cdcee4e83f10f95f9b4406d2f31549c1cfb87cb72b7b1"

RPROVIDES:${PN} += "libdrumstick-rt-alsa-in.so \
libdrumstick-rt-alsa-out.so \
libdrumstick-rt-eassynth.so \
libdrumstick-rt-fluidsynth.so \
libdrumstick-rt-net-in.so \
libdrumstick-rt-net-out.so \
libdrumstick-rt-oss-in.so \
libdrumstick-rt-oss-out.so \
libdrumstick-rt2-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libdrumstick-alsa.so.2 \
libdrumstick-rt.so.2 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsonivox.so.4 \
libstdc++.so.6"

inherit rpm
