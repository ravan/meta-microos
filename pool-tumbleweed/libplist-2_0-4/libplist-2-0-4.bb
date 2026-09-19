SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "libplist-2_0-4-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "92f057293051e3981300fdcce883260814d8243986c42ae9a8e3808788f1a28cd10694cd148f283ff53e384a0fa697a64ba1bd50b6d6dd122e61dd83140d2307"

RPROVIDES:${PN} += "libplist-2-0-4 \
libplist-2.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
