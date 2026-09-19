SUMMARY = "Provides libknet1 zlib support"
DESCRIPTION = "Provides zlib compression support for libknet1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-compress-zlib-plugin-1.33-2.2.aarch64.rpm"
RPM_HASH = "6dc1f3929baabc130bb09563cc4bb2b3ff1a45202a605b7e26f2f4af20543e1f5371121dc1d9c16852e43c6346bea604d33ece5c23ab3f587ade769fd4153353"

RPROVIDES:${PN} += "libknet1-compress-zlib-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libknet1 \
libz.so.1"

inherit rpm
