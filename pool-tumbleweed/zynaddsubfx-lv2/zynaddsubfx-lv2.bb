SUMMARY = "Real-time software synthesizer, LV2 Plugin version"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too. \
 \
This package includes the LV2 zynaddsubfx synthesizer plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-lv2-3.0.6-4.4.aarch64.rpm"
RPM_HASH = "c01726e54763ff06922cbd22825ce9559819b2991c8a66b81afb291019e42828ffaa7597143d792902f10aed4ad2b1ba8d6dd1519e7357979032bdd5fb3359bd"

RPROVIDES:${PN} += "zynaddsubfx-lv2"

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
