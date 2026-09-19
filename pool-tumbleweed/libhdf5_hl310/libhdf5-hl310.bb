SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl310-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "029b0f923890b1c84b06dff34e773523c006d9280684e19bff09112975acfcda7d5ba538a15ddbe4d1548326efd6400f871ebc5128a93b028d27be2ba90adcc5"

RPROVIDES:${PN} += "libhdf5-hl \
libhdf5-hl.so.310 \
libhdf5-hl310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310"

inherit rpm
