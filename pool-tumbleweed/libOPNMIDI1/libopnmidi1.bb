SUMMARY = "A software MIDI synthesizer library with OPN2 emulation"
DESCRIPTION = "A software MIDI synthesizer library with OPN2 (YM2612) and \
OPNA (YM2608) emulation."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.6.2"

RPM_NAME = "libOPNMIDI1-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "7d37b86fb40555b408d8b32dcee3da86114a9f5eeae39a9b3d2fbc974d159e05d4824ecb58a2569a241018457cebb5872b2ad448126bc443e78c100aca9a63bb"

RPROVIDES:${PN} += "libOPNMIDI.so.1 \
libOPNMIDI1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
