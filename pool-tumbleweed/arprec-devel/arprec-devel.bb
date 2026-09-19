SUMMARY = "Development files for the ARbitrary PRECision Computation library"
DESCRIPTION = "ARPREC is a software package for performing arbitrary precision \
arithmetic. It consists of a revision and extension of Bailey's \
earlier MPFUN package, enhanced with special IEEE numerical \
techniques. \
 \
The arprec-devel package contains libraries and header files for \
developing applications that use arprec."
LICENSE = "BSD-3-Clause"

PV = "2.2.17"

RPM_NAME = "arprec-devel-2.2.17-3.9.aarch64.rpm"
RPM_HASH = "672ec97743e7525c0d22d11d0af4d41c1da8f9eb4bb8b1015712fdb68d8495bd4531f9ccd2563f65cc7ba1f43d67b7f4c3fbe049bbe2abd5a67d4392894b6150"

RPROVIDES:${PN} += "arprec-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libarprec0"

inherit rpm
