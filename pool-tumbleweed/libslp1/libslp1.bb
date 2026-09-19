SUMMARY = "An Implementation of the Service Location Protocol V2"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libslp1-2.0.0-22.9.aarch64.rpm"
RPM_HASH = "9b4db33aac27a63155df49b431873d439fb1e134c8d60e8ee7bdac10d0f435eadb81f5bc70851e63adbc955b53befafd3f5f48de9f3f7c246309cf0ec7e07ab3"

RPROVIDES:${PN} += "libslp.so.1 \
libslp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
