SUMMARY = "Plugin for HexChat adds support for LUA scripts"
DESCRIPTION = "The HexChat plugin providing the LUA scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.2"

RPM_NAME = "hexchat-plugins-lua-2.16.2-4.1.aarch64.rpm"
RPM_HASH = "4c646d5262362079afb5d4c4c0ac0f853bda5d69105af299e5d9c7675438a32a1d7ba2d4a5696a24b2c958b0fbc665b983bb1e25d7e6f23455968c4a96f7d1e6"

RPROVIDES:${PN} += "hexchat-plugins-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
liblua5.4.so.5 \
lua"

inherit rpm
