SUMMARY = "Plugin for ZoiteChat adds support for LUA scripts"
DESCRIPTION = "The ZoiteChat plugin providing the LUA scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.19.0"

RPM_NAME = "zoitechat-plugins-lua-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "0b5404054562468373547c6a903fd5f3941e953f1fc90cbec6304c1bc94fd9547d36d9715f550ffbc4650ea40a41c2a334090e651fd8efbb442851bae0502e0e"

RPROVIDES:${PN} += "zoitechat-plugins-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
liblua5.4.so.5 \
lua"

inherit rpm
