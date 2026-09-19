SUMMARY = "The Adaptable IO System (ADIOS)"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. By providing an external \
to the code XML file describing the various elements, their types, \
and how one wishes to process them for a particular run, the routines \
in the host code (either FORTRAN or C) can transparently change how \
they process the data."
LICENSE = "BSD-2-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "adios-openmpi4-1.13.1-9.6.aarch64.rpm"
RPM_HASH = "7cf37d3d7c7448a7e92e6808d68dce54f341f5f64ddab80faf4cc096c1d3e041a5e87341b9981dec6c7d459efd698f7662d008fee30966e1e277f3c002d25406"

RPROVIDES:${PN} += "adios-openmpi4 \
config-adios-openmpi4"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
liblz4.so.1 \
libm.so.6 \
libmpi.so.40 \
libnetcdf.so.22 \
libz.so.1 \
python3-PyYAML \
python3-xml"

inherit rpm
