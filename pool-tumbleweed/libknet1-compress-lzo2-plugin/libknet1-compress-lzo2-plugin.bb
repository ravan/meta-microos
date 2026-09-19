SUMMARY = "Provides libknet1 lzo2 support"
DESCRIPTION = "Provides lzo2 compression support for libknet1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-compress-lzo2-plugin-1.33-2.2.aarch64.rpm"
RPM_HASH = "570f974bbd4edf302b98860e4261bcce6d17a3c6ac280f806156d93595c3053df87db8ab1606c7aea1e8255fc193aae927187baac2f906315e145658377566db"

RPROVIDES:${PN} += "libknet1-compress-lzo2-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libknet1 \
liblzo2.so.2"

inherit rpm
