SUMMARY = "GNUnet library libgnunetnamestore"
DESCRIPTION = "This package contains the libgnunetnamestore library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetnamestore0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "15231dfafd57e3f38f5e1c2eaaf1dddc6379325c51099409b5cf30b5dc349f0316761c57ee9859485eab5e6327dbf17172a4082a0c0b831f14397794c50f6595"

RPROVIDES:${PN} += "libgnunetnamestore.so.0 \
libgnunetnamestore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetgnsrecord.so.0 \
libgnunetutil.so.20"

inherit rpm
