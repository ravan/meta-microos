SUMMARY = "MIME Parser and Utility Library"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.15"

RPM_NAME = "libgmime-3_0-0-3.2.15-1.7.aarch64.rpm"
RPM_HASH = "b53b3c0ec6633ac4ebbdd52bef483d6366510be09b200e504fd80d3dcbaed8aa5653f35e0222b6575dd3dabeff9abbcc98f8ea6049838d1d98ec4acc88a0cf5b"

RPROVIDES:${PN} += "libgmime-3-0-0 \
libgmime-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libidn2.so.0 \
libz.so.1"

inherit rpm
