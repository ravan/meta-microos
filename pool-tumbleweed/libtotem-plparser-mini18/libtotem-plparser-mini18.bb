SUMMARY = "Mini version of the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.7"

RPM_NAME = "libtotem-plparser-mini18-3.26.7-1.4.aarch64.rpm"
RPM_HASH = "3eb4ff0fa324a1d836cef601aac4eb4f295ef22ffd4074a3e4600d81759c7a4bd06596131bf2179886a0176e8867dbf5da5cc3554e886da19de4d32550b689b2"

RPROVIDES:${PN} += "libtotem-plparser-mini.so.18 \
libtotem-plparser-mini18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
totem-pl-parser"

inherit rpm
