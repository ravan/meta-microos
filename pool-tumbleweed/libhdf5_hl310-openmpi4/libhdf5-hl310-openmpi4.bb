SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl310-openmpi4-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "0da86fd3d7af729231a97797f1634f8f51647aef6e7772ffbf158dc7b215f39f3d6c6c9416b540cc0033fca2c080d1d84b5c4524c88140da62c72a73a17d5807"

RPROVIDES:${PN} += "libhdf5-hl-openmpi4 \
libhdf5-hl.so.310 \
libhdf5-hl310-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310"

inherit rpm
