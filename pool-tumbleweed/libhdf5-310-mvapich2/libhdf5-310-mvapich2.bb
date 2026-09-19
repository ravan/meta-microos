SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5-310-mvapich2-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "9e3aa841e9de4a93af190335f8cc8ef3d14e03bed744591d66dec775754a0186f6801207e99058167b4996f69e48e4db7a1a95d0fd2e01d131e342a38e895079"

RPROVIDES:${PN} += "libhdf5-310-mvapich2 \
libhdf5-mvapich2 \
libhdf5.so.310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libz.so.1"

inherit rpm
