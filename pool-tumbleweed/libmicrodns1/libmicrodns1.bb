SUMMARY = "Shared library files for libmicrodns"
DESCRIPTION = "Minimal mDNS resolver (and announcer) library. \
The libmicrodns1 package contains shared libraries files for libmicrodns."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0+6"

RPM_NAME = "libmicrodns1-0.2.0+6-2.13.aarch64.rpm"
RPM_HASH = "5c5ce64e5874f77058bc1cf9ea83eb30b9bc9e5c48b44962b8bf2995b50d35d2b58cfc9d8dc0f4894d7b88cd37c170cdd71a92c6859948db56f7c324a652ae93"

RPROVIDES:${PN} += "libmicrodns.so.1 \
libmicrodns1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
