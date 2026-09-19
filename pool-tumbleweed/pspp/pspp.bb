SUMMARY = "A program for statistical analysis of sampled data"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
PSPP development is ongoing. It already supports a large subset of \
SPSS's syntax. Its statistical procedure support is currently \
limited, but growing. At your option, PSPP will produce statistical \
reports in ASCII, PostScript, PDF, HTML, SVG, or OpenDocument formats."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "pspp-2.1.1-2.2.aarch64.rpm"
RPM_HASH = "0fdabe1454191271910357eec5fb722591c834ddb7196405a18d1796b79cb9adb7153c66cbacb10aaefc75832d27e6c4cdad6c2ab99965bffee2c9a80d6c94ed"

RPROVIDES:${PN} += "config-pspp \
libpspp-2.1.1.so \
libpspp-core-2.1.1.so \
pspp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsl.so.28 \
libgslcblas.so.0 \
libgthread-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libreadline.so.8 \
libspread-sheet-widget.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
