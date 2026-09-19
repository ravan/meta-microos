SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - ipmi support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.4"

RPM_NAME = "libgensio_openipmi_oshandler14-3.0.4-1.1.aarch64.rpm"
RPM_HASH = "089c732dd736ed41284a7da65a1baec09f93fd93a68cad32d564f1fdca9bf406d2e6e5cff4d4cbb5827bd52f04e2d5c19d1468c9d1a14fade38edb187aaa73c0"

RPROVIDES:${PN} += "libgensio-openipmi-oshandler.so.14 \
libgensio-openipmi-oshandler14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIutils.so.0 \
libc.so.6"

inherit rpm
