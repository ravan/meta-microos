SUMMARY = "Quake II - Three Wave Capture The Flag for yamagi-quake2"
DESCRIPTION = "This package provides the Three Wave Capture The Flag game mode \
for yamagi-quake2, an enhanced port of the original Quake II."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "yamagi-quake2-ctf-1.13-1.2.aarch64.rpm"
RPM_HASH = "a9187b92807f5e3102e35d255444d427729dd0067f1375f56a0dbb460957681fa17a3f19c8a1b8b8b530a276a8e67684d01299a266ecfa995e40b49cb607b72e"

RPROVIDES:${PN} += "yamagi-quake2-ctf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
yamagi-quake2"

inherit rpm
