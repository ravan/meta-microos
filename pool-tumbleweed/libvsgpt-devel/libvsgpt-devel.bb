SUMMARY = "Development files for libvsgpt"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsgpt."
LICENSE = "LGPL-3.0-or-later"

PV = "20260911"

RPM_NAME = "libvsgpt-devel-20260911-1.1.aarch64.rpm"
RPM_HASH = "e050b869ed3c14b133bdbdce4d4a0ccf4464630b70bd6e08dc1ab7bf647466bc892fbb2b9e6570dab1e2dbd208d5c1a5090564239b5d91f2fab31ca0fabdccc2"

RPROVIDES:${PN} += "libvsgpt-devel \
pkgconfig-libvsgpt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsgpt1"

inherit rpm
