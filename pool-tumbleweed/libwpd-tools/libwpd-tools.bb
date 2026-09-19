SUMMARY = "Tool from libwpd, a library for importing WordPerfect documents"
DESCRIPTION = "Tools to transform WordPerfect Documents into other formats. Currently \
supported: html, raw, text"
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-tools-0.10.3-3.19.aarch64.rpm"
RPM_HASH = "8ec78440b5d48495829e638cd20bc77e11e80ee34cf6fef130caff540b08230d71651bf961be652ae67128c86cec85bf6c917f53f2d889c9a2681de7247fccdf"

RPROVIDES:${PN} += "libwpd-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libwpd-0.10.so.10"

inherit rpm
