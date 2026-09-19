SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-devel-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "b7c151871e2f38c402d7c15356ec30c587071768e75cfa0b40a5d8d079cb2b2368772a82b27f280ee91c5d63ab47b30417e6f94a86ebd00e02718bc1d455fae2"

RPROVIDES:${PN} += "gcc15-devel"

RDEPENDS:${PN} += "gcc15 \
gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
mpc-devel"

inherit rpm
