SUMMARY = "GObject-based library for the Telepathy D-Bus API"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "libtelepathy-glib0-0.24.2-3.9.aarch64.rpm"
RPM_HASH = "96923a92e3c7f1949cc9a7945d43af9dcb1ff8f11cb628aa7f1dfc5f3b6e4deac6dfe32dce6575b0442b810e3db048e1e8a20f844881b20b47c6d1b0161ca08b"

RPROVIDES:${PN} += "libtelepathy-glib.so.0 \
libtelepathy-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
