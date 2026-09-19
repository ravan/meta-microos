SUMMARY = "Libev port of Shadowsocks"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides libraries for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.6"

RPM_NAME = "libshadowsocks-libev2-3.3.6-3.3.aarch64.rpm"
RPM_HASH = "fc4b137700bcdf3e399bac393fc1c99914e9f2c4c9fc056f8b4f18ab287b73bd117c8ab141ad7398c1024fbf4430e4f1ffc57bca92c16a908cabae7d2d8919b8"

RPROVIDES:${PN} += "libshadowsocks-libev.so.2 \
libshadowsocks-libev2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
libm.so.6 \
libmbedcrypto.so.16 \
libpcre2-8.so.0 \
libsodium.so.26"

inherit rpm
