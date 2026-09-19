SUMMARY = "Library for importing WordPerfect Documents"
DESCRIPTION = "libwpd is a general purpose library for reading or interpreting data \
from WordPerfect files. The library is not a stand-alone utility: it is \
designed to be used by another program (for example, a word processor) \
as an in-process component."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-0_10-10-0.10.3-3.19.aarch64.rpm"
RPM_HASH = "06abdbb86618ef96aed0a9481d556c7e30cf096c337e1d545a6335e1daab6181fff6f6f8b8987b89a79599e254c78d82e56235224c9b10c488f4eb23e029e84e"

RPROVIDES:${PN} += "libwpd-0-10-10 \
libwpd-0.10.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
