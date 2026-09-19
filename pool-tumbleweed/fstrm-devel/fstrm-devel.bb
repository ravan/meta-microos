SUMMARY = "Development files for fstrm, a Frame Streams implementation in C"
DESCRIPTION = "This is fstrm, a C implementation of the Frame Streams data transport protocol. \
 \
This packages holds the development files."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "fstrm-devel-0.6.1-1.16.aarch64.rpm"
RPM_HASH = "c8ae3b47d221733be3a15a7befa72e201951e5c911e610d3bf4d6784534537b8e8654288fd41cef13e2ef73f2c43a943ecc27d6f1a95ce714312c3b3d181310c"

RPROVIDES:${PN} += "fstrm-devel \
libfstrm-devel \
pkgconfig-libfstrm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfstrm0"

inherit rpm
