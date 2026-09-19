SUMMARY = "SQLite plugin for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the strongswan sqlite plugin."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "strongswan-sqlite-6.1.0-1.1.aarch64.rpm"
RPM_HASH = "4c780a04be037b15ca9dd5306bbf4b3d3069e8e74f5fb738660ed8389dea650368113a10c3c037e69226900afdefe3c063ca62f17f5160ba5c7f0a566fbb99ed"

RPROVIDES:${PN} += "config-strongswan-sqlite \
libstrongswan-sqlite.so \
strongswan-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
strongswan"

inherit rpm
