SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_tools310-openmpi4-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "e39cd533687202ccea40794f29e91e8f517f46627236067298378ac999a7bcfc882de143c5656d5f373a048d583214788b271c57a0225086beb2d182221ece65"

RPROVIDES:${PN} += "libhdf5-tools-openmpi4 \
libhdf5-tools.so.310 \
libhdf5-tools310-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libmpi.so.40"

inherit rpm
