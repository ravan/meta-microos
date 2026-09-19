SUMMARY = "Virtual Machine for Scheme48"
DESCRIPTION = "A devel files for scheme48 and scheme48-prescheme. This includes a header files, \
libprescheme.so and scheme48-config."
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "scheme48-devel-1.9.3-1.14.aarch64.rpm"
RPM_HASH = "d185f2f2ee894d2f18eb38f1a4e3eaf4e3d9d8fe1d56b88a4e099bbfe671f5e23f3ed3356bb7d7355cc6943159eb2009f68fdbcc8962d527bc2fd3876de07cf4"

RPROVIDES:${PN} += "scheme48-devel"

RDEPENDS:${PN} += "/usr/bin/scheme-srfi-7 \
scheme48"

inherit rpm
