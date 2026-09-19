SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map certificates."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libsss_certmap0-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "edc69e8a6bca534d5fa0c7b23b6c278dc71dc6e79727ad6fba18d3c92e7c2bb105a12586a37d19c21363e4cb79abe808bd3516aa909d0138b855ef34b45445d1"

RPROVIDES:${PN} += "libsss-certmap.so.0 \
libsss-certmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtalloc.so.2"

inherit rpm
