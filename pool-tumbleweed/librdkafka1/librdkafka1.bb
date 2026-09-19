SUMMARY = "A library for changing configuration files"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support."
LICENSE = "BSD-2-Clause"

PV = "2.15.0"

RPM_NAME = "librdkafka1-2.15.0-1.1.aarch64.rpm"
RPM_HASH = "462d051eba7eb40576803766e3cda127fd81f953fd9accc5897c9eb531253b7ecaf992be9de29de44ba250f22a964ddeaf46a755d653c406632312dda566be70"

RPROVIDES:${PN} += "librdkafka++.so.1 \
librdkafka.so.1 \
librdkafka1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
liblz4.so.1 \
libm.so.6 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
