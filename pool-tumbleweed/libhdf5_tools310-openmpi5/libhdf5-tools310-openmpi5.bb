SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_tools310-openmpi5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "e4ac9d89f304ec75ad4c8b18037449ab4ef2f1ac48c90d4d5d2489730b307dc50cb6d25aaca2e7ac206a04453fa6763560ae31afd0a098836d9ee338771a7f40"

RPROVIDES:${PN} += "libhdf5-tools-openmpi5 \
libhdf5-tools.so.310 \
libhdf5-tools310-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libmpi.so.40"

inherit rpm
