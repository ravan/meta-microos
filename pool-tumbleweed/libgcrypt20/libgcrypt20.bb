SUMMARY = "The GNU Crypto Library"
DESCRIPTION = "Libgcrypt is a general purpose crypto library based on the code used in \
GnuPG (alpha version)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.12.4"

RPM_NAME = "libgcrypt20-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "58d2164b4e6b959dfc6bc0df0ee7bfe585fadcb13634ab28e3cdff8ebfbc819e27b73db20c2a4ce32d9c6dc90c27a858eb1d226f3250dda5506766defcfac08c"

RPROVIDES:${PN} += "config-libgcrypt20 \
libgcrypt.so.20 \
libgcrypt20 \
libgcrypt20-hmac"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpg-error.so.0 \
libjitterentropy.so.3 \
libjitterentropy3"

inherit rpm
