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

RPM_NAME = "adios-openmpi5-1.13.1-9.6.aarch64.rpm"
RPM_HASH = "fdd86c86d26750b3848cf3ae9df2bac2014fe2eb4dd5ce4d659a731c7236055c85a4f721dafbce5181cee268049a68d11ba9279ff65ed83b4a7d4cee6229e3b4"

RPROVIDES:${PN} += "adios-openmpi5 \
config-adios-openmpi5"

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
