SUMMARY = "GNUnet library libgnunettestingcore"
DESCRIPTION = "This package contains the libgnunettestingcore library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettestingcore0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "ee32720823854bdfc2956bf929b97fc6b5c63375dbffed1e822ffd10988c638993b87b2c481eb1849fcf364b72025df508c620bc571dc2405333ee959070012d"

RPROVIDES:${PN} += "libgnunettestingcore.so.0 \
libgnunettestingcore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetcore.so.0 \
libgnunettesting.so.3 \
libgnunettestingarm.so.0 \
libgnunetutil.so.20"

inherit rpm
