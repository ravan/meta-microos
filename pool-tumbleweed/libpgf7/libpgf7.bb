SUMMARY = "Progressive Graphics File Library"
DESCRIPTION = "libpgf is a library for working with PGF (Progresive Graphics File) images."
LICENSE = "LGPL-2.1-or-later"

PV = "7.21.7"

RPM_NAME = "libpgf7-7.21.7-1.21.aarch64.rpm"
RPM_HASH = "0ffa543a3825bd2a96e321b1f63ed140aa75d43a0bf1c9f59d2847e89b97181b382830b7de5b0197df1aea09621a7b24373789b587ba07488b159238b7723cf2"

RPROVIDES:${PN} += "libpgf.so.7 \
libpgf7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
