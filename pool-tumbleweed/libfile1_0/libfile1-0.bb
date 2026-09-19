SUMMARY = "Library for heuristic file type determination based on content"
DESCRIPTION = "The library implements a heuristic file type determinator, \
similar to file/libmagic1."
LICENSE = "BSD-2-Clause"

PV = "2024.03.21"

RPM_NAME = "libfile1_0-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "c9eb61584c0139641ea6daa8c2a7b27af24c94a0e65e2e42fe1a0b6b7d48db05c9fe1976ddb8a8dfa8f50c3fc84a57ce526146b7c5aa137011bf0ca675a97aa8"

RPROVIDES:${PN} += "libfile.so.1.0 \
libfile1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
