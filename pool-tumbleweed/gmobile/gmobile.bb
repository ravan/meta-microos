SUMMARY = "Some helpers for glib based environments on mobile devices"
DESCRIPTION = "gmobile carries some helpers for glib based environments on mobile devices. \
 \
Some of those parts might move to glib or libgnome-desktop eventually. It can be used as a shared library or git submodule. \
There aren't any API stability guarantees at this point in time."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "gmobile-0.4.0-2.4.aarch64.rpm"
RPM_HASH = "e338c91b75d304590d171948077701092b0d3ed56d5db839b575c9e9700d0f4c248145048c65d94b86fa040168c95a8e28f6a0285818f41e40908c40a17933b1"

RPROVIDES:${PN} += "gmobile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmobile.so.0 \
libgobject-2.0.so.0"

inherit rpm
