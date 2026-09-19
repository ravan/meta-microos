SUMMARY = "Provides libknet1 lzma support"
DESCRIPTION = "Provides lzma compression support for libknet1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-compress-lzma-plugin-1.33-2.2.aarch64.rpm"
RPM_HASH = "ef8b94c71a6911360ea2f8727346a4774110fbd646e905b3a2b1c0e650f769433f85f88e908a859c1dc1adfbf40af546da54f23895a88247b7cd5e8bc1d1a77e"

RPROVIDES:${PN} += "libknet1-compress-lzma-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libknet1 \
liblzma.so.5"

inherit rpm
