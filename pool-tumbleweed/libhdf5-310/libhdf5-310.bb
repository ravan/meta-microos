SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5-310-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "eaa9b306253620c9a5a2c79512c41fdc433185ea3703ef1332f245aacd4c0c0b5906dec0e42f6ef871f2e6f344584a2e1d2fbcc04612010731b68bfda18cc70f"

RPROVIDES:${PN} += "libhdf5 \
libhdf5-310 \
libhdf5.so.310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
