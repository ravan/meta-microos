SUMMARY = "An example application using libproxy"
DESCRIPTION = "An example application that will use libproxy to give the results that can \
be expected from other applications. It can be used to debug what would \
happen in various cases."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.5.12"

RPM_NAME = "libproxy-tools-0.5.12-2.4.aarch64.rpm"
RPM_HASH = "3972120573732e0b99f946273b9449e6bdcdeb49d2527c5660c32fabe7e827f7c2ff654cff3ae48fc6634b8dccc21196222dbca63040a28959f49224ecdfb8f6"

RPROVIDES:${PN} += "libproxy-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libproxy.so.1 \
libproxy1"

inherit rpm
