SUMMARY = "OpenTTD Dedicated Server binary (without SDL)"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the binary openttd-dedicated without dependency of SDL."
LICENSE = "GPL-2.0-only"

PV = "15.3"

RPM_NAME = "openttd-dedicated-15.3-1.3.aarch64.rpm"
RPM_HASH = "f9691a0da3de1e42cf5b2dede3a8af5995cdf46afcf81ff731f21b0bec19f530be06eddcf4cf4c8487c5819500c965443984d3c70ee49396a05581dcfdd3272d"

RPROVIDES:${PN} += "openttd-dedicated"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
openttd-data"

inherit rpm
