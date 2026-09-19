SUMMARY = "Octave interface for openEMS"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method. \
 \
This package provides Octave interface for openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.36"

RPM_NAME = "octave-openEMS-0.0.36-4.8.aarch64.rpm"
RPM_HASH = "1db246d8a5a7016ddfb137e2063a2d7a87cb766f574afffb31424138f011bcb27ff0fba9b83fd625f9f57feacec51cff9952bf911f09213fa30505252367b9e4"

RPROVIDES:${PN} += "octave-openEMS"

RDEPENDS:${PN} += "/usr/bin/sh \
AppCSXCAD \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libstdc++.so.6 \
octave-CSXCAD \
octave-api-v61 \
octave-cli \
openEMS"

inherit rpm
