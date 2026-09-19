SUMMARY = "A library for /usr/bin/find-like functionality"
DESCRIPTION = "libfind allows to be used for adding find(1)-like command-line features \
to programs."
LICENSE = "CDDL-1.0"

PV = "1.8"

RPM_NAME = "libfind4_0-1.8-53.5.aarch64.rpm"
RPM_HASH = "81e1cc3fdbb56152711f9f747eb6349757507179f499a4342c47c348905aa59eaebe2c336ba83fe0b8aeba295c953f093c507f3fbf5cda784ee49f2c535d32cb"

RPROVIDES:${PN} += "libfind.so.4.0 \
libfind4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
