SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes classes providing file input and output in formats \
commonly used by MIDI programs. Currently, SMF (standard MIDI file) \
read/write and WRK (Cakewalk) file read are supported. This library does not \
depend on ALSA."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "libdrumstick-file2-2.11.1-1.1.aarch64.rpm"
RPM_HASH = "bb439778da11a8bd3ed728ff807c1c83d9f115b83de1d45f02f80d6a0c649d2e41a6d36663fc66b845b805f82e5bcc87572d97a8d048e8b342b20026416b62a6"

RPROVIDES:${PN} += "libdrumstick-file.so.2 \
libdrumstick-file2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
