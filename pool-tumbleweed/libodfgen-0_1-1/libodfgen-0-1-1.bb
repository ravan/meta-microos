SUMMARY = "Library to generate ODF documents from libwpd's and libwpg's api calls"
DESCRIPTION = "libodfgen is a general purpose library designed to generate ODF documents \
from api calls to libwpd and libwpg libraries."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-0_1-1-0.1.8-4.6.aarch64.rpm"
RPM_HASH = "677214f261ccdda46ae744ffa13cbf999da0840511867ff087c82c0f32b467c6439a3db039bcc7488f7173e8ab1e1ceb9cbb1845501b62b7768ccd511040c7b2"

RPROVIDES:${PN} += "libodfgen-0-1-1 \
libodfgen-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
