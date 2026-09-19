SUMMARY = "API for ssdeep"
DESCRIPTION = "Libraries for ssdeep, the primary library is libfuzzy.*"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "libfuzzy2-2.14.1-1.34.aarch64.rpm"
RPM_HASH = "201df316ff448080c9c3910ae666d089874cf4c7fe12de74647fcdd748ca866b30fe1f226dc02ca1e307afbdbd135d625a8bef2f6d36e0867078c10e8cd2460e"

RPROVIDES:${PN} += "libfuzzy.so.2 \
libfuzzy2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
