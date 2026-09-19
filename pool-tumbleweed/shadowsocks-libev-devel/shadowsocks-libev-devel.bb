SUMMARY = "Development headers for shadowsocks-libev"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.6"

RPM_NAME = "shadowsocks-libev-devel-3.3.6-3.3.aarch64.rpm"
RPM_HASH = "5c3605503f85d2ae86fe9eb55e97d621dde353f55ca2061d6d4d8893c05e54eb05583a2217d8e3d465a11fb93b15a8a2428e51e5b7adbbdd5a0efa4ec4c9803d"

RPROVIDES:${PN} += "pkgconfig-shadowsocks-libev \
shadowsocks-libev-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshadowsocks-libev2"

inherit rpm
