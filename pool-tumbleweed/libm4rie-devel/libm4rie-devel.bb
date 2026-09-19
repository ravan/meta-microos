SUMMARY = "Development files for GF(2^e) arithmetic with libm4rie"
DESCRIPTION = "M4RIE is a library for arithmetic with dense matrices over the \
Galois Field GF(2^e). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libm4rie."
LICENSE = "GPL-2.0-or-later"

PV = "20250128"

RPM_NAME = "libm4rie-devel-20250128-1.7.aarch64.rpm"
RPM_HASH = "3aeadb9bfb8843004289f5a8f66e57abef9135ba78605a9998d7b2f23951f376c469aae26b1f91df9f0d312e6466efc2f3167a56880e61869e7198481d3752bf"

RPROVIDES:${PN} += "libm4rie-devel \
pkgconfig-m4rie"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libm4rie1 \
pkgconfig-m4ri"

inherit rpm
