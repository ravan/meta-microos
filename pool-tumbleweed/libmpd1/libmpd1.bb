SUMMARY = "The libmpd package"
DESCRIPTION = "libmpd is a library that provides high-level, callback-based access to Music \
Player Daemon."
LICENSE = "GPL-2.0+"

PV = "11.8.17"

RPM_NAME = "libmpd1-11.8.17-3.10.aarch64.rpm"
RPM_HASH = "a5222787ec53320808638019cb46238a21c53f0096952fb21ddad70915ed36fd85fb6a5492247d9f5c59836be066bbeedb6ad5fa18f5390ca7220ce86d9f7018"

RPROVIDES:${PN} += "libmpd.so.1 \
libmpd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
