SUMMARY = "Headers for the library of Optimized Inner Loops"
DESCRIPTION = "Liboil is a library of functions that are optimized for various \
CPUs."
LICENSE = "BSD-2-Clause"

PV = "0.3.17"

RPM_NAME = "liboil-devel-0.3.17-26.18.aarch64.rpm"
RPM_HASH = "682b3c6795819f45995df56fdd893c346c0be8e407216a4eca3fd35ac63c0f82d3dd17c0f7aaf61efa46b7811b5c4198f7a82f46b10c33cbe756ad20ba97e5f5"

RPROVIDES:${PN} += "liboil-devel \
pkgconfig-liboil-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libc.so.6 \
liboil-0-3-0 \
liboil-0.3.so.0"

inherit rpm
