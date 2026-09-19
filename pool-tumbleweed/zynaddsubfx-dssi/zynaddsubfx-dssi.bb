SUMMARY = "Real-time software synthesizer, DSSI Plugin version"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too. \
 \
This package includes the DSSI zynaddsubfx synthesizer plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-dssi-3.0.6-4.4.aarch64.rpm"
RPM_HASH = "03dbb956cd4022e45b56364f899b99b091c6022c8f100e8fdcb7c97b9e78ae57f0c8b84bf32ff7e8dfb811dadd7e39d1518fe1cf3f10379aa027f3bce39fc7c8"

RPROVIDES:${PN} += "libzynaddsubfx-dssi.so \
zynaddsubfx-dssi"

RDEPENDS:${PN} += "dssi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
liblo.so.7 \
libm.so.6 \
libmxml.so.1 \
libstdc++.so.6 \
libz.so.1 \
zynaddsubfx-common"

inherit rpm
