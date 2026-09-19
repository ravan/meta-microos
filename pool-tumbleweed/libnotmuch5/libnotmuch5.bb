SUMMARY = "A shared library for notmuch"
DESCRIPTION = "A global-search and tag-based email system which uses Xapian for indexing. \
 \
The libnotmuch5 package contains shared libraries for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.38.3"

RPM_NAME = "libnotmuch5-0.38.3-5.6.aarch64.rpm"
RPM_HASH = "a5384f2af0e9321b60c89285ee02c2866436adb04fdef63675f41bbebe91bd834f637cb2d285fc8be5574b349b236a109cef13014e58933fc74c7a6dc0909754"

RPROVIDES:${PN} += "libnotmuch.so.5 \
libnotmuch5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libsexp.so.1 \
libstdc++.so.6 \
libtalloc.so.2 \
libxapian.so.30"

inherit rpm
