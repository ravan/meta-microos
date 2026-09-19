SUMMARY = "GNU regression, econometrics and time-series library"
DESCRIPTION = "Gretl (GNU regression, econometrics and time-series library) comprises \
libgretl, a shared library which provides various functions relating to \
econometric estimation, a command-line client program and a gui client, \
using GTK+."
LICENSE = "GPL-3.0-only"

PV = "2025a"

RPM_NAME = "gretl-2025a-1.7.aarch64.rpm"
RPM_HASH = "0dc9c215c7c66c37f38450656096cc48397f86f4c4f448884a415b8e341771e2f80d815a3bb19e9d0d78901c4acef28848c640db2a7d933ff07d5a1bd000572b"

RPROVIDES:${PN} += "gretl"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgretl-1.0.so.51 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libjson-glib-1.0.so.0 \
liblapack.so.3 \
libm.so.6 \
libmpfr.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
