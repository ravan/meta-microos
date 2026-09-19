SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libedataserverui4-1_0-0-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "9827146a950d2c346672eaede6ff097f10e66926f3f7a713fca373c43c090c93d263e8fea812b9b25aa0facc6573f600dbe33de058558e428fbf1b87295e4e2e"

RPROVIDES:${PN} += "libedataserverui4-1-0-0 \
libedataserverui4-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libical-glib.so.3 \
libnspr4.so \
libnss3.so \
libpango-1.0.so.0 \
libsmime3.so \
libsoup-3.0.so.0 \
libwebkitgtk-6.0.so.4"

inherit rpm
