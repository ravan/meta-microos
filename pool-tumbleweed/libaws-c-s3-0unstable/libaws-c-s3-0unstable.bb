SUMMARY = "Shared library files for aws-c-s3 library"
DESCRIPTION = "AWS Crypto Abstraction Layer: Cross-Platform, C99 wrapper for cryptography primitives. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.13.7"

RPM_NAME = "libaws-c-s3-0unstable-0.13.7-1.1.aarch64.rpm"
RPM_HASH = "0844fb41353ae9e16909c8cbe8676381ce7c93a288cd555ee74ea32baa6d73040f341c3b28b0cd0a89d1b30a85d9cc070c431e70bddc96791c86867980857a47"

RPROVIDES:${PN} += "libaws-c-s3-0unstable \
libaws-c-s3.so.0unstable \
libaws-c-s30unstable"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-auth.so.1.0.0 \
libaws-c-cal.so.0unstable \
libaws-c-common.so.1 \
libaws-c-http.so.1.0.0 \
libaws-c-io.so.0unstable \
libaws-checksums.so.1 \
libc.so.6"

inherit rpm
