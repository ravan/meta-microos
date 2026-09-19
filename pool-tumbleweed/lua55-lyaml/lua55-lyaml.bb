SUMMARY = "LibYAML binding for Lua"
DESCRIPTION = "LibYAML binding for Lua, with a fast C implementation for converting between YAML 1.1 and Lua tables, \
and a low-level YAML event parser for implementing more intricate YAML document loading."
LICENSE = "MIT"

PV = "6.2.8"

RPM_NAME = "lua55-lyaml-6.2.8-3.3.aarch64.rpm"
RPM_HASH = "575ed91709c079aa380361333ed2952e5433ded0ac300afe855e225632ea6d611e45e10b915dbd35ba28bcdb39d2cf99ca0ce86d70afb1344cfa00c4a1d2166f"

RPROVIDES:${PN} += "lua55-lyaml"

RDEPENDS:${PN} += "libc.so.6 \
libyaml-0.so.2 \
lua55"

inherit rpm
