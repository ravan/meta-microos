SUMMARY = "Documents for shadowsocks-libev"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides Documents for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.6"

RPM_NAME = "shadowsocks-libev-doc-3.3.6-3.3.noarch.rpm"
RPM_HASH = "adae3e6f6ae29c0884a1e62159c5751f8a5c8f4ed2133b234b8e6734287f036c480ab264b897f88e986ce55cc2948f4a3259ea48c48e9b23962f074667ee28ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shadowsocks-libev-doc"

RDEPENDS:${PN} += "shadowsocks-libev"

inherit rpm
