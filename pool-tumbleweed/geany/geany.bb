SUMMARY = "GTK-based integrated development environment"
DESCRIPTION = "Geany is a text editor using the GTK+ toolkit with basic features of \
an integrated development environment. It can do syntax highlighting \
for many formats, case folding, symbol name autocompletion, autoclose \
XML/HTML tags, provides code navigation and has a plugin interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "geany-2.1-1.7.aarch64.rpm"
RPM_HASH = "005369f2d0b9fa671220a5d5bb1a7702c0c807f16c52958c105ee1405f816354a935c38d2df18ff5e562f0f99eee1e7968e17b6982be09bef79dcbd03e6c7a49"

RPROVIDES:${PN} += "geany"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgeany.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
