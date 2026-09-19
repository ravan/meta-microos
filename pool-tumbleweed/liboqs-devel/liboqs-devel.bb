SUMMARY = "Headers for liboqs, a library for quantum-resistant cryptography"
DESCRIPTION = "liboqs is a C library for quantum-resistant cryptographic algorithms. \
See the bundled README.md for particular limitations on intended use."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "liboqs-devel-0.16.0-3.1.aarch64.rpm"
RPM_HASH = "afc2c5fd99593039ba914a1c0f5793fd2bb29ea07be02f9412a81172412c9781dbf5dddd07df6faf26463899a9cad150db60a2b65885039e9a97348749982f72"

RPROVIDES:${PN} += "cmake-liboqs \
liboqs-devel \
pkgconfig-liboqs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboqs9 \
pkgconfig-openssl"

inherit rpm
