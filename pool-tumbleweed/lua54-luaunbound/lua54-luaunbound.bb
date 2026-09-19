SUMMARY = "This is a binding to libunbound for Lua"
DESCRIPTION = "This is a binding to libunbound for Lua"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "lua54-luaunbound-1.0.0-3.3.aarch64.rpm"
RPM_HASH = "151726d7cd35d0bdd0af80bb0f9668d7433d456bcdf31c5998bcfd18f82e2218b8599bb6419ddb74894e40db7d86d731b3595cdaf61024758ff7dae94f945586"

RPROVIDES:${PN} += "lua-luaunbound \
lua54-luaunbound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libunbound.so.8"

inherit rpm
