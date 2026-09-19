SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl310-mvapich2-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "e0d5615df77138418235d85a6d7805401f009f49b2be42c470b95a2e8abd51ff29cbef0052b927b131bf6c40a48180b105d3f8a2ed0e2e8888f9c36caa94b252"

RPROVIDES:${PN} += "libhdf5-hl-mvapich2 \
libhdf5-hl.so.310 \
libhdf5-hl310-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libmpi.so.12"

inherit rpm
