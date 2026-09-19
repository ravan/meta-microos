SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi5 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl310-openmpi5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "0c11b191556c9dc9519e862b28444b4c94009b0a11e2a6e6c3c25d9f03926c536d9d31eaf4d829895f623b33fad119e9e0ee3f7c20433526ca0cae4074d61717"

RPROVIDES:${PN} += "libhdf5-hl-openmpi5 \
libhdf5-hl.so.310 \
libhdf5-hl310-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310"

inherit rpm
