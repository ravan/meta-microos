SUMMARY = "GNUnet library libgnunetrest"
DESCRIPTION = "This package contains the libgnunetrest library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetrest0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "ad6be1147388570f1f201953e9a2b3e13a04095336d6105f55152a20a1f687251511ee459ff388d9632076465d6519068099c88da3a7ed1571c235ef4d8a630c"

RPROVIDES:${PN} += "libgnunetrest.so.0 \
libgnunetrest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20 \
libmicrohttpd.so.12"

inherit rpm
