SUMMARY = "Shared library files for aws-checksums library"
DESCRIPTION = "Cross-Platform hardware-accelerated CRC32c and CRC32 with fallback to \
efficient software implementations. C interface with language bindings \
for each of the AWS SDKs. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "libaws-checksums1-0.2.11-1.1.aarch64.rpm"
RPM_HASH = "77a8e300e90f7c1f817461ff64dd2c7cd987cb611156b4b8bdd49b6abcb85cea9203c3cae157aa9b91b2e1a4661445f533d8ae5c682c55af1ed55bd5a6af788f"

RPROVIDES:${PN} += "libaws-checksums.so.1 \
libaws-checksums1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libc.so.6"

inherit rpm
