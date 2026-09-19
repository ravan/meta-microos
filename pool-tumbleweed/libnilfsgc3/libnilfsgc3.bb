SUMMARY = "Garbage collection library for interacting with nilfs"
DESCRIPTION = "This package contains shared garbage collection library needed for some \
applications to interface with nilfs"
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "libnilfsgc3-2.3.1-2.3.aarch64.rpm"
RPM_HASH = "e3d809196a44bafd0a69e32b451c6e3fc605a33110304f2bff8c017b2d6993e1e42a3c89ea7e5732130c4f82cb55721c5b69bdcf2a5155e7780500d277b849d8"

RPROVIDES:${PN} += "libnilfsgc.so.3 \
libnilfsgc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnilfs.so.3"

inherit rpm
