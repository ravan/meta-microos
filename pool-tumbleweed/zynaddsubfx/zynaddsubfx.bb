SUMMARY = "A Real-Time Software Synthesizer for Linux"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-3.0.6-4.4.aarch64.rpm"
RPM_HASH = "b1035f7b81219fbc8cacd14a1da7cf6bcbe92e8d784ff4e0c189d3e463c7faae60b2aabcc36a5325ff9161454a4f3dab6f303eec7e9d791ef36cfe6cab9176c5"

RPROVIDES:${PN} += "ZynAddSubFX \
zynaddsubfx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXpm.so.4 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libmxml.so.1 \
libntk-images.so.1 \
libntk.so.1 \
libportaudio.so.2 \
libstdc++.so.6 \
libz.so.1 \
zynaddsubfx-common"

inherit rpm
