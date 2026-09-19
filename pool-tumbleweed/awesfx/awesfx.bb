SUMMARY = "SoundFont Utilities for SB AWE32/64 and Emu10k1 Drivers"
DESCRIPTION = "The AWESFX package includes utility programs for controlling the \
wavetable function on SB AWE32/64 and Emu10k1 sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "awesfx-0.5.2-6.10.aarch64.rpm"
RPM_HASH = "5eae05d7506cdb941c1d1281b2d7e6969e9af4d548bf4ce07d06561ffc690d1030011655f271840a2c9d29bdd4aa60a7b3e3841fc28575b9a135e1969d5df2d9"

RPROVIDES:${PN} += "awesfx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
