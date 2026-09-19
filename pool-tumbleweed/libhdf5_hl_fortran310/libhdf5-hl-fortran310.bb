SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl_fortran310-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "6c342c1325e04a109c7ae996e94fcadae3c7bbe59ebf3ea03e2e951d3e3628b592887a000dc2692863f7070497fd4143da924f323b4712189cdddbfaa2cd6462"

RPROVIDES:${PN} += "libhdf5-hl-f90cstub.so.310 \
libhdf5-hl-fortran \
libhdf5-hl-fortran.so.310 \
libhdf5-hl-fortran310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-f90cstub.so.310 \
libhdf5-fortran.so.310 \
libhdf5-hl.so.310 \
libhdf5.so.310"

inherit rpm
