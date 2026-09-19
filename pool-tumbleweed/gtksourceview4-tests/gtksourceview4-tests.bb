SUMMARY = "Installed tests for gtksourceview4"
DESCRIPTION = "Installed tests for GtkSourceView 4, compatible with gnome-desktop-testing-runner. \
Tests cover syntax highlighting, buffer operations, completion, and search."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "gtksourceview4-tests-4.8.4-3.1.aarch64.rpm"
RPM_HASH = "4d2a4996586f0f9238b03d95217a1713b1c43ecb5b52698f7ccd9423c58d864ce328993c9757180a32fd1adc040f4faa16b9f516c38925a0dfb97f1878b2d35d"

RPROVIDES:${PN} += "gtksourceview4-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4-0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.16"

inherit rpm
