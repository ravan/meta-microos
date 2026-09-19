SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libebook-1_2-21-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "63eec444cc132c025c50691a8546881fed2b9f7e84b8aa71c2b1de2e66317dfa2b90bea8998ffd67372f4d157270828acd0cfddcd06fea6d97810ced4fc67700"

RPROVIDES:${PN} += "libebook-1-2-21 \
libebook-1.2.so.21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libebook-contacts-1.2.so.5 \
libedata-book-1.2.so.27 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnss3.so \
libsmime3.so \
libxml2.so.16"

inherit rpm
