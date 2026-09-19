SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5-310-openmpi4-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "9bfb32a3bbe8d8e128ce8f4905e7068498c236be60896a6e1d6165d90b625d247935ea9ef317441c01579e6f6ab7f254fe924cf51d0485d91ad73db66503bea5"

RPROVIDES:${PN} += "libhdf5-310-openmpi4 \
libhdf5-openmpi4 \
libhdf5.so.310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libz.so.1"

inherit rpm
