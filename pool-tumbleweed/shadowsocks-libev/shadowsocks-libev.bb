SUMMARY = "Libev port of Shadowsocks"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.6"

RPM_NAME = "shadowsocks-libev-3.3.6-3.3.aarch64.rpm"
RPM_HASH = "a6d1319f1719ea54d739f5cced3dc67a812032d7c56981cab839df87233fe1610b0fb84ef82187309c95e3b3c0b3b94abe43b1c6a8b4376b3673ecec23ec852a"

RPROVIDES:${PN} += "config-shadowsocks-libev \
shadowsocks-libev"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
group-shadowsocks \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libev.so.4 \
libm.so.6 \
libmbedcrypto.so.16 \
libpcre2-8.so.0 \
libsodium.so.26 \
shadow \
shadowsocks-sysuser"

inherit rpm
