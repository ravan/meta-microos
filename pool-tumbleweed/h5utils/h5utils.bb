SUMMARY = "Utilities for Data Conversions from hdf5"
DESCRIPTION = "h5utils is a set of utilities for visualization and conversion of \
scientific data in the HDF5 format."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.13.2"

RPM_NAME = "h5utils-1.13.2-1.15.aarch64.rpm"
RPM_HASH = "2775061fd3973b4d99cc1d3d0a8b2874bf2eca5d6bf46ebdaf1e3279254a716728ac49878eb6c5ef045cfdad95eeb6523a6c9ced6c886ed58ca6fa08b25b6734"

RPROVIDES:${PN} += "h5utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libm.so.6 \
libpng16.so.16 \
meep"

inherit rpm
