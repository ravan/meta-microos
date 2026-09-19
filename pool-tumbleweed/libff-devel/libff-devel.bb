SUMMARY = "Development files for libff"
DESCRIPTION = "The libff-devel package contains libraries and header files for developing applications that use libff."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libff-devel-1.0.0-3.7.aarch64.rpm"
RPM_HASH = "c0ed51159b51ce3c935f3c477372398f1cd6df693861f22de2d05e2aebfcce1e152a5cf938de6a653e84f85477618ce5adacebef2e1c9eb0968bbe639ea09beb"

RPROVIDES:${PN} += "libff-devel"

RDEPENDS:${PN} += "libff-1-0-0"

inherit rpm
