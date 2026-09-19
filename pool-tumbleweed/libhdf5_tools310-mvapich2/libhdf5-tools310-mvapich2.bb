SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_tools310-mvapich2-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "297c364acd9408dcc8879d2b326517b098ab4a7cfa3b00e0eeec5e518eaacebedaff276e2d2469d32ae2714c71630591e703587153db8107b6d1fd4fd5e97d8b"

RPROVIDES:${PN} += "libhdf5-tools-mvapich2 \
libhdf5-tools.so.310 \
libhdf5-tools310-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libmpi.so.12"

inherit rpm
