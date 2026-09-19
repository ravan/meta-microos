SUMMARY = "Small library that passes a menu structure across D-Bus"
DESCRIPTION = "This package contains the shared library for the dbusmenu-glib."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib4-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "85737d35968fd8015ce1d847dfc0874ffdb4101db5935306bcc8d8d8eafb3bada4e7d185adbc4c7961b1bf844060d9a0693a4dba757b9874aa6fa8bd863fe89a"

RPROVIDES:${PN} += "libdbusmenu-glib.so.4 \
libdbusmenu-glib4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
