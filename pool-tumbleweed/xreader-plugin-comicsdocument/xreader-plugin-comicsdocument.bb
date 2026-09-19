SUMMARY = "Comics document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Comics documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-plugin-comicsdocument-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "0b00c14acc70ea3e29729c631af07ecfedd1cefb5202a0ee247f980606fa261293a83da5961ccdd6c6d543eec49f6862056d5c46b219e129dddfbbb9d85fa3f3"

RPROVIDES:${PN} += "libcomicsdocument.so \
xreader-plugin-comicsdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
