SUMMARY = "MATE Desktop keyboard configuration shared libraries"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "libmatekbd6-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "354bd7d3c3a556cc765186c090a61099845d8dd28bd7c7c84272ec14de72180d75dae17a7f851620f90e5ae24a40ab266c4604b8b0c51054c2ec23a0d14d7ffd"

RPROVIDES:${PN} += "libmatekbd \
libmatekbd.so.6 \
libmatekbd6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxklavier.so.16 \
matekbd-common"

inherit rpm
