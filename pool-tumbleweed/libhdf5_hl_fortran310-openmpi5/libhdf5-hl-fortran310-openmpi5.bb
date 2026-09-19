SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi5 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl_fortran310-openmpi5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "53746b171bfa6df5a868c5a136ea2741309d1f98051c82b82630009fae75e5e53caecfbba4e148633383bee59c06e42541fc1f434e49232a0f91b1f66a078903"

RPROVIDES:${PN} += "libhdf5-hl-f90cstub.so.310 \
libhdf5-hl-fortran-openmpi5 \
libhdf5-hl-fortran.so.310 \
libhdf5-hl-fortran310-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-f90cstub.so.310 \
libhdf5-fortran.so.310 \
libhdf5-hl.so.310 \
libhdf5.so.310"

inherit rpm
