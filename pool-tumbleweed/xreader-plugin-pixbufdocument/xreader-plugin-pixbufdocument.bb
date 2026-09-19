SUMMARY = "Pixbuf document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Pixbuf documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-plugin-pixbufdocument-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "bda9d3e32283f44202b874cb57bb02ae823b4b33b2ad898357030b481e74c2e8b64d2ba96031c586ae72dfa66670b2b759c324c0efdf4d8921b12286bfd80a65"

RPROVIDES:${PN} += "libpixbufdocument.so \
xreader-plugin-pixbufdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
