SUMMARY = "GNU Unicode string library"
DESCRIPTION = "This portable C library implements Unicode string types in three flavours: \
(UTF-8, UTF-16, UTF-32), together with functions for character processing \
(names, classifications, properties) and functions for string processing \
(iteration, formatted output, width, word breaks, line breaks, normalization, \
case folding and regular expressions)."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "libunistring5-1.4.2-1.3.aarch64.rpm"
RPM_HASH = "fe90cbcb609b733e4d34cc2b9ec955d5bae7f7b9eec59d2bddf0723376f6ed11d804ab97ed399348d50315789bfa8cd1a2f0bd0021ac36db151341ea71f0207a"

RPROVIDES:${PN} += "libunistring.so.5 \
libunistring5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
