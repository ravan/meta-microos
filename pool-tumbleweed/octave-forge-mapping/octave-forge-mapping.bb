SUMMARY = "Octave mapping functions"
DESCRIPTION = "Simple Mapping and GIS .shp, .dxf and raster file functions. \
 \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "octave-forge-mapping-1.4.3-1.7.aarch64.rpm"
RPM_HASH = "1bdf44c137880901ff00b772b51f95be6408133ccc16b30d810dc11134a0e22ba8001887de2216c73aac873d50804341ea56100a3915f6520e1b790eeeaa44f9"

RPROVIDES:${PN} += "octave-forge-mapping"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-geometry \
octave-forge-io"

inherit rpm
