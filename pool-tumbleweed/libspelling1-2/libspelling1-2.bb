SUMMARY = "A spellcheck library for GTK 4"
DESCRIPTION = "A spellcheck library for GTK 4. \
This library is heavily based upon GNOME Text Editor and GNOME \
Builder's spellcheck implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.10"

RPM_NAME = "libspelling1-2-0.4.10-4.1.aarch64.rpm"
RPM_HASH = "93b260e30b0bf432b4162ac207a023c11d778b864f7768932f365a7630b3e1c6f4d0ecb97d4406d5bf68cbac98098bc3a65e02fa436942ddf4fd4ed76921346d"

RPROVIDES:${PN} += "libspelling \
libspelling-1.so.2 \
libspelling1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libicuuc.so.78 \
libpango-1.0.so.0"

inherit rpm
