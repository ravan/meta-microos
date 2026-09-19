SUMMARY = "Headers and source for developing against bandicoot"
DESCRIPTION = "Bandicoot is a GPU linear algebra library (matrix maths) for the C++ language, \
aiming towards a good balance between speed and ease of use. It provides \
high-level syntax and functionality deliberately similar to Matlab. \
 \
This package provides headers and sources for developing against bandicoot."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "bandicoot-devel-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "12c8ef72960eed469935d99388204ca0b1e5fb65804975081c971f045e30b035cbc7541f0ab246012d4e40029a4a0b85d260145a8fa29966de0d0f57d83b1793"

RPROVIDES:${PN} += "bandicoot-devel \
pkgconfig-bandicoot"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbandicoot4"

inherit rpm
