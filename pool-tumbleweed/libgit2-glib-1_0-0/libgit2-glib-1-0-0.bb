SUMMARY = "GLib wrapper library around libgit2"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "libgit2-glib-1_0-0-1.2.1-2.4.aarch64.rpm"
RPM_HASH = "cceaa16fad469604f0e2c38da3b4dddcb6f52815197dd225016251aa5b0833e0c4f92cbe99b600a7a6e4152c386cdce7bc1568eece1ceb741b5fb3b7187d7854"

RPROVIDES:${PN} += "libgit2-glib-1-0-0 \
libgit2-glib-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgit2.so.1.9 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
