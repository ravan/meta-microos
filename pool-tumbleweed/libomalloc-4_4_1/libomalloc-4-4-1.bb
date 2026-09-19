SUMMARY = "The omalloc memory allocator library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libomalloc-4_4_1-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "4514a33b5d879cd92af18e4becc46a82b4981b6424868bebffac8fad12734ea74940926384b841e574fe6a6bde96e1591271be678c62a054dba0c03c09a19ecd"

RPROVIDES:${PN} += "libomalloc-4-4-1 \
libomalloc-4.4.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
