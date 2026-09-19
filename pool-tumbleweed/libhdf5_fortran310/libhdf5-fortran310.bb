SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_fortran310-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "dbbe9893eee5860381ee5b59af7bcc4aa913815ca98e365d79680d17bd8c86655cde35bd460a9398014803d215d7a738f3644ede924a2998ebf12c6c7d8d5e90"

RPROVIDES:${PN} += "libhdf5-f90cstub.so.310 \
libhdf5-fortran \
libhdf5-fortran.so.310 \
libhdf5-fortran310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5.so.310"

inherit rpm
