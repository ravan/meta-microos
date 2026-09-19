SUMMARY = "Comics document support for Evince"
DESCRIPTION = "A plugin for Evince to read Comics documents."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-plugin-comicsdocument-48.4-2.1.aarch64.rpm"
RPM_HASH = "da25054d739a50fb3f5fece9144e20e919491b71146340f755be75e7b1be98a280986924233e7dfc5619e1fcb104c5a08e5726449ad5eac89875c85bc99f04b3"

RPROVIDES:${PN} += "evince-plugin-comicsdocument \
libcomicsdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
