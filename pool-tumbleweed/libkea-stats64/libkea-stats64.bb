SUMMARY = "Kea DHCP Statistics Manager library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-stats64-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "95a793eff87439c68deff3bddf55b2c256d38a58539b7d766a464025769b79fc14d8f2d62842270edcf8c5623862805102be540924769c6169aeb88ec62bfadc"

RPROVIDES:${PN} += "libkea-stats.so.64 \
libkea-stats64"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.98 \
libkea-exceptions.so.55 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
