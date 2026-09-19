SUMMARY = "Osmocom core library"
DESCRIPTION = "libosmocore is a library with various utility functions shared \
between OpenBSC and OsmocomBB."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmocore22-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "14c0f93fcdf5159cacf40d4171719d6419c16b43a66575173606449d8eb8bd041c56cac373ec89024a15224dc72c2de66073e6c3e27001e6fb69980b906c5e37"

RPROVIDES:${PN} += "libosmocore.so.22 \
libosmocore22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libsctp.so.1 \
libtalloc.so.2 \
liburing.so.2"

inherit rpm
