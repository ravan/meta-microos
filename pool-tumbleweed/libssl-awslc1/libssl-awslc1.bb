SUMMARY = "Library file for aws-lc"
DESCRIPTION = "Library file for aws-lc."
LICENSE = "Apache-2.0"

PV = "5.5.0"

RPM_NAME = "libssl-awslc1-5.5.0-1.2.aarch64.rpm"
RPM_HASH = "6de2b3a5f6b55395b2e5cbaa91fcb8a259ddb72d1adfad3a4cc78703370062f620b959c3c581423aef375775f392df3f78ac76d5241b6217ae33ff27553d7665"

RPROVIDES:${PN} += "libssl-awslc.so.1 \
libssl-awslc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto-awslc.so.1"

inherit rpm
