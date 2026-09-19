SUMMARY = "Octave functions for reading and writing FITS files"
DESCRIPTION = "Functions for reading and writing FITS (Flexible Image Transport System) files. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.7"

RPM_NAME = "octave-forge-fits-1.0.7-3.9.aarch64.rpm"
RPM_HASH = "a4a295efb3de7bd955b8e0d1394fe514c1183edad3bae1889f735c8cdd1d5c7bfacb9af2c3c555ef02545b0ebd061569b87bd2324d5f95420cd6b60ce90f9668"

RPROVIDES:${PN} += "octave-forge-fits"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
