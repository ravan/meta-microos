SUMMARY = "PDF document support for Evince"
DESCRIPTION = "A plugin for Evince to read PDF documents."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-plugin-pdfdocument-48.4-2.1.aarch64.rpm"
RPM_HASH = "647495b8f387d4e01054e543ba49b37b83967b7c770a19d9deb7aaa0f48ccebfaad02333e4c15b785233af09610e82b4bbe5de90e0cca407fc86cf72a128cac7"

RPROVIDES:${PN} += "evince-plugin-pdfdocument \
libpdfdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpoppler-glib.so.8"

inherit rpm
