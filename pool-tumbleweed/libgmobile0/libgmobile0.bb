SUMMARY = "Some helpers for glib based environments on mobile devices"
DESCRIPTION = "gmobile carries some helpers for glib based environments on mobile devices. \
 \
Some of those parts might move to glib or libgnome-desktop eventually. It can be used as a shared library or git submodule. \
There aren't any API stability guarantees at this point in time."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libgmobile0-0.4.0-2.4.aarch64.rpm"
RPM_HASH = "cf9bfe3c0f680f6aeeacd71891473e2696552970da0e0b9a94afc1d1d22f489e3bf0018ba9e1edbcbca9a4866314d876ceb754f0f5164a83089673b1dd0b5be1"

RPROVIDES:${PN} += "libgmobile.so.0 \
libgmobile0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6"

inherit rpm
