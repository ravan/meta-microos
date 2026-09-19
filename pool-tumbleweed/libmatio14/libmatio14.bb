SUMMARY = "Library for reading and writing MATLAB MAT files"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.30"

RPM_NAME = "libmatio14-1.5.30-1.4.aarch64.rpm"
RPM_HASH = "5fe5db6f75d66cd825a1be89da604868e54b0b8bb6588ce9b82dcb2ba71830a417abdabbeb28dc1769d26664a6f785cf1cdd22877fbef4de0b185a7269abe610"

RPROVIDES:${PN} += "libmatio.so.14 \
libmatio14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5 \
libhdf5.so.310 \
libz.so.1"

inherit rpm
