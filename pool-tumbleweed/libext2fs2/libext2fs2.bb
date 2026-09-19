SUMMARY = "Ext2fs library"
DESCRIPTION = "The basic Ext2fs shared library."
LICENSE = "LGPL-2.0-only"

PV = "1.47.3"

RPM_NAME = "libext2fs2-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "8f2c7d317c31f612d8fcdbecaa1c26a0d26c7e3d4b8264fee2cdc0e520e13b8b9a67267dba57191255891ed95a5c2cf7086add5cd9eaea2ee11f0da62e6c9c18"

RPROVIDES:${PN} += "libe2p.so.2 \
libext2fs.so.2 \
libext2fs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2"

inherit rpm
