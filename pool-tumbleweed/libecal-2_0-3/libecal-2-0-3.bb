SUMMARY = "Evolution Data Server's Calendar Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access calendars."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libecal-2_0-3-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "0d6ed134cc12ff141bc374ca0d739ed0edcef74688d9582f43062a36e6b62053ea6846ea570e6f59dde4d2608fc519ede01c705fc22a1e071deb0cc2c183de5e"

RPROVIDES:${PN} += "libecal-2-0-3 \
libecal-2.0.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical-glib.so.3 \
libical.so.3"

inherit rpm
