SUMMARY = "Computational Geometry for Octave"
DESCRIPTION = "Library for geometric computing extending MatGeom functions. \
Useful to create, transform, manipulate and display geometric \
primitives. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later"

PV = "4.1.0"

RPM_NAME = "octave-forge-geometry-4.1.0-1.7.aarch64.rpm"
RPM_HASH = "163b62b5e02d0f4ea0c7da7bd6933fb4c652528307dde22717159f2431030651de75369a59163ca6fe57b04a470150489d18b3447b16a740af3f99a33a9889ca"

RPROVIDES:${PN} += "octave-forge-geometry"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liboctmex.so.1 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-matgeom"

inherit rpm
