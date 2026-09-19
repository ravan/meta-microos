SUMMARY = "Real-time software synthesizer, VST Plugin version"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too. \
 \
This package includes the VST zynaddsubfx synthesizer plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-vst-3.0.6-4.4.aarch64.rpm"
RPM_HASH = "e4577f41f0cc70e51dd36efe6860b736ae96ced1ed07fe85dad5740085ca7d0c757bd5b66c7462f9569bf05edf4f15bf860283c6eddd843d2f6fac5b8c4a7536"

RPROVIDES:${PN} += "zynaddsubfx-vst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
