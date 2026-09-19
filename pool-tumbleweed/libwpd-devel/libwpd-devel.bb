SUMMARY = "Development files for libwpd, a library for importing WordPerfect documents"
DESCRIPTION = "libwpd is a general purpose library for reading (or, interpreting data \
from) WordPerfect files. The library is not a stand-alone utility: it \
is designed to be used by another program (e.g.: a word processor) as \
an in-process component."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-devel-0.10.3-3.19.aarch64.rpm"
RPM_HASH = "dbef617bb29f4d675c3c68c4f5189472d533f9f0d0219b650e72a07dedd7db4acb21dc1752f0217a502d3e4469e6de8363e6d7e8534f0ff7e683c15ce6bb47b0"

RPROVIDES:${PN} += "libwpd-devel \
pkgconfig-libwpd-0.10"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel \
libwpd-0-10-10 \
pkgconfig-librevenge-0.0"

inherit rpm
