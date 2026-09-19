SUMMARY = "Evolution Data Server's Calendar Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for calendar backends."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libedata-cal-2_0-2-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "e3d4f86815b879ff9d2b235559da460e4eab0d68f51313d828c3a76ac0aa4355ec663ae15e3bad861811047f702be102fbbcbd392afcfcb5a72926f96e020706"

RPROVIDES:${PN} += "libedata-cal-2-0-2 \
libedata-cal-2.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libebackend-1.2.so.11 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical-glib.so.3 \
libsoup-3.0.so.0 \
libsqlite3.so.0"

inherit rpm
