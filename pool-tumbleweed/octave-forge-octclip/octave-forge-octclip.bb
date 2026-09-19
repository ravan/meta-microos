SUMMARY = "Octave clipping polygons tool"
DESCRIPTION = "This package allows to do boolean operations with polygons using \
the Greiner-Hormann algorithm. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "octave-forge-octclip-2.0.3-2.9.aarch64.rpm"
RPM_HASH = "620f0e976554b5e45fd5762f6991bed214bec31f3d49f55841ac6bbc20fa038073ba7028b714aef5d24d7844ba8ef7fe385943f34868233f9292606be9f7f35e"

RPROVIDES:${PN} += "octave-forge-octclip"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
