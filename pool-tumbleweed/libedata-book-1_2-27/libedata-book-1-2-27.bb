SUMMARY = "Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libedata-book-1_2-27-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "e8bb0a8b95c33a134d57fa9db6a09162397d5f843a672a54108a66c5b88753fb5cde1f317fd94d190b0640a602a65a2ba911b6d67356f05353cd6eac7d063ecd"

RPROVIDES:${PN} += "libedata-book-1-2-27 \
libedata-book-1.2.so.27"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libebackend-1.2.so.11 \
libebook-contacts-1.2.so.5 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0"

inherit rpm
