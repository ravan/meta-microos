SUMMARY = "HTTP server for Teletext pages"
DESCRIPTION = "alevtd reads the teletext pages from /dev/vbi and allows to fetch them \
via http, i.e. you can read the teletext pages with a web browser."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "alevtd-3.107-3.9.aarch64.rpm"
RPM_HASH = "a40acf8e271b713e0181c475e723e84380ee3668e2450d0ce6e895e875fd2f459697198729e25bb2cf1b2f912102f7fac0d730ec3d2a195d508ec74e8b6a769a"

RPROVIDES:${PN} += "alevtd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzvbi.so.0"

inherit rpm
