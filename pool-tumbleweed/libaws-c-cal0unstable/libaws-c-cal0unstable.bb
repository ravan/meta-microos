SUMMARY = "AWS C99 wrapper for cryptography primitives"
DESCRIPTION = "AWS Crypto Abstraction Layer is a C99 wrapper for cryptography primitives. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.9.15"

RPM_NAME = "libaws-c-cal0unstable-0.9.15-1.1.aarch64.rpm"
RPM_HASH = "4e8f2fccd2b4947b5a4c91cd13d6b670a9010a8a0312b4cf5849d213849032fd85c4f734552dedabf01b5ab7e6bf37a85b70fb5fdd91d90214ec55b2a155e4ec"

RPROVIDES:${PN} += "libaws-c-cal.so.0unstable \
libaws-c-cal0unstable"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
