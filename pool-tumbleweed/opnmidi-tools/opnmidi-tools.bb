SUMMARY = "A MIDI player with OPN2 emulation"
DESCRIPTION = "OpnMIDI is a commandline program that plays MIDI files using software \
OPN2 emulation."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.6.2"

RPM_NAME = "opnmidi-tools-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "711fd8188ada4634162c061d207e3a966cc9942d728acbbfa0822d6a04d81fdaff2aa706cfdaa475af2c600400fda2cd1e2374bc09d0d864a53724f8f6849903"

RPROVIDES:${PN} += "opnmidi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOPNMIDI.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
