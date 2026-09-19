SUMMARY = "Private library for Budgie Menu"
DESCRIPTION = "Private library for Budgie menu to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "libbudgie-appindexer0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "ccd8521a2048cc7ec8f688c08abe7383f53c7d51532b0f43b81bc5737514b31bd762f718e6790ee9ecdef34da1a9caeb3a9606e5f8326c7a7e4d2e52e1bcbaef"

RPROVIDES:${PN} += "libbudgie-appindexer.so.0 \
libbudgie-appindexer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbudgie-private.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
