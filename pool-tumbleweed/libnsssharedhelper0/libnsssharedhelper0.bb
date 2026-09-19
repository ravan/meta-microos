SUMMARY = "Helper functions for sharing NSS database"
DESCRIPTION = "This library provides helper functions for programs that want to share \
an NSS crypto database."
LICENSE = "LGPL-2.1+"

PV = "1.0.10"

RPM_NAME = "libnsssharedhelper0-1.0.10-9.37.aarch64.rpm"
RPM_HASH = "4858a061e91b2e98751909610588d6d694c8bdfebc2db85f8dc44ed9498e716cb0e2546fdd4d9c4fd1dd6dd53dd7268de518041e14f45fef8a5be5c3a02354f4"

RPROVIDES:${PN} += "libnsssharedhelper.so.0 \
libnsssharedhelper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so"

inherit rpm
