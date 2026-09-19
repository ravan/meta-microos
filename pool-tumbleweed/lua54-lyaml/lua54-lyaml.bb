SUMMARY = "LibYAML binding for Lua"
DESCRIPTION = "LibYAML binding for Lua, with a fast C implementation for converting between YAML 1.1 and Lua tables, \
and a low-level YAML event parser for implementing more intricate YAML document loading."
LICENSE = "MIT"

PV = "6.2.8"

RPM_NAME = "lua54-lyaml-6.2.8-3.3.aarch64.rpm"
RPM_HASH = "1d9c6121c05260f51b0bc422193f02bb5cba55e69bb564c2e16b0802c96ba2ff0acb68b2d8e14b33145b0ed510f3dbd6355e8c44bf0b20e717a6243ab87dbd5b"

RPROVIDES:${PN} += "lua-lyaml \
lua54-lyaml"

RDEPENDS:${PN} += "libc.so.6 \
libyaml-0.so.2 \
lua54"

inherit rpm
