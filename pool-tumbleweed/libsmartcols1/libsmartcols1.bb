SUMMARY = "Column-based text sort engine"
DESCRIPTION = "Library to sort human readable column-based text output."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libsmartcols1-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "d07f91ec3bb4c21a4c91dc356876caf8adeb3dec060738e50020be0e0a71781086fc7343613b1a2edf7f3accb794485a6b6fe14afe2c779e932de3ddb47a8e86"

RPROVIDES:${PN} += "libsmartcols.so.1 \
libsmartcols1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
