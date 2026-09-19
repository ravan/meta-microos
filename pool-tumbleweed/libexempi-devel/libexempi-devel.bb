SUMMARY = "Development files for the Exempi XMP support library"
DESCRIPTION = "Exempi is a library for XMP metadata parsing and doing I/O with it. \
 \
This subpackage contains the header files for building applications \
with Exempi."
LICENSE = "BSD-3-Clause"

PV = "2.6.6"

RPM_NAME = "libexempi-devel-2.6.6-1.5.aarch64.rpm"
RPM_HASH = "6d4c3ff244b4f68b847afb649d05d0ec114a8fbd8b2fd9017411a36037368b7b22fb7dd057b3f238632379b9aabb1e8c3f044d1d3f12178d6fc3c0289c0b7f6a"

RPROVIDES:${PN} += "libexempi-devel \
pkgconfig-exempi-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexempi8"

inherit rpm
