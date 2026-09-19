SUMMARY = "Checksums package for AWS SDK for C"
DESCRIPTION = "Core c99 package for AWS SDK for C. Includes cross-platform primitives, \
configuration, data structures, and error handling."
LICENSE = "Apache-2.0"

PV = "5.5.0"

RPM_NAME = "aws-lc-5.5.0-1.2.aarch64.rpm"
RPM_HASH = "f7ee7d79b678b0bb238a176a723b869aab54278c0067e8213624335717c2be06125b8bde43259765b7ac4719d6b3b971a635649f367d8fd89ea20b9a75583880"

RPROVIDES:${PN} += "aws-lc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto-awslc.so.1 \
libssl-awslc.so.1 \
libstdc++.so.6"

inherit rpm
