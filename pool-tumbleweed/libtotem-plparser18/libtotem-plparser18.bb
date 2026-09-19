SUMMARY = "A GObject-based library to parse playlist formats"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.7"

RPM_NAME = "libtotem-plparser18-3.26.7-1.4.aarch64.rpm"
RPM_HASH = "72f82b473fab8190ea6b955489a3a376cfdb920da1317eaa08fe114e58ff771d2909490c8a16aa4eedb39ddea94e34ec25734793b3934d71250be7aea16ed293"

RPROVIDES:${PN} += "libtotem-plparser.so.18 \
libtotem-plparser18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libuchardet.so.0 \
libxml2.so.16 \
totem-pl-parser"

inherit rpm
