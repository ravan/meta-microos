SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libebook-contacts-1_2-5-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "631d8e9a93fc2a4573907483abb9a6f56166b012fc83241b6e9030b1fae4f9ec8e15887696a35f43b2ded0d6e2cffef35f1f1a2a0687d7de250bd2188e2b1e1a"

RPROVIDES:${PN} += "libebook-contacts-1-2-5 \
libebook-contacts-1.2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libedataserver-1.2.so.27 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libphonenumber.so.9 \
libstdc++.so.6"

inherit rpm
