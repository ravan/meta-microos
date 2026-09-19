SUMMARY = "Zeitgeist Engine"
DESCRIPTION = "Zeitgeist is a service that logs the users activity. The log can be \
queried and managed in various ways over a DBus API. \
 \
This is the Zeitgeist backend engine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "zeitgeist-1.0.4-1.9.aarch64.rpm"
RPM_HASH = "0b8c9560bb802baadab904ea968fa31ae402507dd11a0204565809f1224f279533b8d79ff1ed17db0cc3aa1c2c975e5f6671cbc8e7e92c386d82954bcc82bfc3"

RPROVIDES:${PN} += "zeitgeist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtelepathy-glib.so.0 \
libxapian.so.30 \
libzeitgeist-2.0.so.0 \
python-abi \
python3-xdg \
python3-xml"

inherit rpm
