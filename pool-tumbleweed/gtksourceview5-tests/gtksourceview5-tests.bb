SUMMARY = "Installed tests for gtksourceview5"
DESCRIPTION = "Installed tests for GtkSourceView 5, compatible with gnome-desktop-testing-runner. \
Tests cover syntax highlighting, buffer operations, completion, and search."
LICENSE = "LGPL-2.1-or-later"

PV = "5.20.0"

RPM_NAME = "gtksourceview5-tests-5.20.0-2.1.aarch64.rpm"
RPM_HASH = "786b57f8f9dcc63b561dde49b988ad9fc3ad7175befba89b0be47bc680ab48ffd4f4b44d213f619ca9b4a924b4b235dd37d75ccd144a0813b67c2ffe962444d7"

RPROVIDES:${PN} += "gtksourceview5-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5-0 \
libgtksourceview-5.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpcre2-8.so.0 \
libxml2.so.16"

inherit rpm
