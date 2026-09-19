SUMMARY = "A simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "libxplayer-plparser18-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "c5609b2190b6c16143cf72cf793ce2418d1fdd23b7b668a0b1799c9ead8ad17b9badb0d8ce6f98a14ed51b2cf4711531feec65fb64ff284bf09c4b9bcc61c630"

RPROVIDES:${PN} += "libxplayer-plparser.so.18 \
libxplayer-plparser18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.16 \
xplayer-plparser"

inherit rpm
