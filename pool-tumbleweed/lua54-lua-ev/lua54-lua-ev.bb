SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua54-lua-ev-1.5-7.3.aarch64.rpm"
RPM_HASH = "e90056e0913a64deb156f1391b40e5134173969830cc92fa38a6ae765a04bdc5a149a9a8bacd821da17036b4545f6bb222b6c5b6208bfdf337b5e8831608529b"

RPROVIDES:${PN} += "lua-lua-ev \
lua54-lua-ev"

RDEPENDS:${PN} += "libc.so.6 \
libev.so.4 \
liblua5.4.so.5 \
lua54"

inherit rpm
