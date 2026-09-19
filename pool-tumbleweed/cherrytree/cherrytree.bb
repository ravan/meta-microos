SUMMARY = "A hierarchical note taking application"
DESCRIPTION = "A hierarchical note taking application, featuring rich text and syntax \
highlighting, storing all the data (including images) in a single xml \
file with extension '.ctd'."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "1.6.3"

RPM_NAME = "cherrytree-1.6.3-2.4.aarch64.rpm"
RPM_HASH = "69b1729f65949c5440e7b02f5805e9d7f3695032a7ed1fde0cc4fabc60b9ff6f5b3885cdbc61a60ab31fc9067e5ec375fc2488be1bc4e72c466f4f638e10b886"

RPROVIDES:${PN} += "cherrytree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libcurl.so.4 \
libfmt.so.12 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgspell-1.so.3 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtksourceview-4.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libuchardet.so.0 \
libvte-2.91.so.0 \
libxml++-2.6.so.2 \
libxml2.so.16"

inherit rpm
