SUMMARY = "DjVu document support for Evince"
DESCRIPTION = "A plugin for Evince to read DjVu documents."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-plugin-djvudocument-48.4-2.1.aarch64.rpm"
RPM_HASH = "58048638e7de6d5e35a88a437845ad0419306b71ba44753a37352e11cba922b0ac11e050a26ce950d16993b37ed592697f48c8eec0baa5c25f24436f25a37bdf"

RPROVIDES:${PN} += "evince-plugin-djvudocument \
libdjvudocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
