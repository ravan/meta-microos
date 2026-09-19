SUMMARY = "Benchmarktool for aws-lc"
DESCRIPTION = "Benchmarktool for aws-lc."
LICENSE = "Apache-2.0"

PV = "5.5.0"

RPM_NAME = "aws-lc-benchmark-5.5.0-1.2.aarch64.rpm"
RPM_HASH = "6028648c528c8acefeac7e86e3055e375a3484d28eb7269a6e03f7882f2a31e2f8497584d53c3a1b58a080169f83dacb049541144b448a2bcbb72580d0d7163e"

RPROVIDES:${PN} += "aws-lc-benchmark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto-awslc.so.1 \
libssl-awslc.so.1 \
libstdc++.so.6"

inherit rpm
