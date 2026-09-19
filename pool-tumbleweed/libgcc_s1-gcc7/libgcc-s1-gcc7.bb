SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgcc_s1-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "4d99b368d9d5ccd4bfee69a4e19d6516d4f8b29ef049401d2373883c97a9cd6baa7fd702785d7d39fbb3ecbee3215248748dd89818a049ab9d678f49aef2b6d4"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1 \
libgcc-s1-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
