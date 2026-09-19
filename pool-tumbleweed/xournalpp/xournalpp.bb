SUMMARY = "Notetaking software designed around a tablet"
DESCRIPTION = "Xournal++ is a hand note taking software. \
It supports pen input, e.g. Wacom tablets."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7"

RPM_NAME = "xournalpp-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "bbb6ad6afa6895ac75c8a08c8524241d8a7ee8a986f1e851bf7487eb669d85019c1e38b9dd724a6b0004a0375d9da95f3dba45e8d190db166241c9e74aee5c19"

RPROVIDES:${PN} += "xournalpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpoppler-glib.so.8 \
libportaudio.so.2 \
libportaudiocpp.so.0 \
libqpdf.so.30 \
librsvg-2.so.2 \
libsndfile.so.1 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1 \
libzip.so.5"

inherit rpm
