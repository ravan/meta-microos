SUMMARY = "Osmocom MS lookup library"
DESCRIPTION = "This shared library contains routines for looking up mobile subscribers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-mslookup0-1.4.0-2.14.aarch64.rpm"
RPM_HASH = "f9c47097c3f38452fc48be41e60166d70e59e6ba460f3116fd46e5a844f15d596b7de79d8b6517e0c457cd6c062d1d32d1912a4215f5a55752e703493d316c96"

RPROVIDES:${PN} += "libosmo-mslookup.so.0 \
libosmo-mslookup0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libosmogsm.so.20 \
libtalloc.so.2"

inherit rpm
