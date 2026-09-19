SUMMARY = "MPRIS api for lua"
DESCRIPTION = "MPRIS api for lua"
LICENSE = "MIT"

PV = "0.0+git20191025.2b12542"

RPM_NAME = "lua54-lua-mpris-0.0+git20191025.2b12542-6.2.aarch64.rpm"
RPM_HASH = "3c2ad14e53fb5bf6d71a9d674aa2e025c32259c6588353d8add67da89db67be1cd5092c0c28d1758c45760204a4622f64f5e2608ca02e0ead238962a9680a7a9"

RPROVIDES:${PN} += "lua-lua-mpris \
lua54-lua-mpris"

RDEPENDS:${PN} += "lua54 \
lua54-lua-dbus"

inherit rpm
