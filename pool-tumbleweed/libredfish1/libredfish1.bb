SUMMARY = "Headers for building apps that use libredfish"
DESCRIPTION = "This package contains headers required to build applications that use libredfish."
LICENSE = "BSD-3-Clause"

PV = "1.3.8.0+git.f9a23c3"

RPM_NAME = "libredfish1-1.3.8.0+git.f9a23c3-1.5.aarch64.rpm"
RPM_HASH = "9797c9880809a6a25cb6f1d5320505d48a4e687261a10c1ed7ff4491c2c4a6f41d56c67b47b8d11bfb849242714d23fb4055f48fd024cc2ce73f22f67f4a6244"

RPROVIDES:${PN} += "libredfish.so.1 \
libredfish1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libczmq.so.4 \
libjansson.so.4 \
libssl.so.3"

inherit rpm
