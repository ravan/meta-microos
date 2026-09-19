SUMMARY = "Test suite for libfabric API"
DESCRIPTION = "Fabtests provides a set of examples that uses libfabric, a fabric software library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "fabtests-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "4234e2ba23c7820c69e013773da51456001d0ccb82264a9e58549f9671575d53f0aee49c2e67a3f95a15d5515a7f88e44f07bc0fe21eb97f0fc7ea501e197738"

RPROVIDES:${PN} += "fabtests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1"

inherit rpm
