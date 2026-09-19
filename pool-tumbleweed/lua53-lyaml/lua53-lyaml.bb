SUMMARY = "LibYAML binding for Lua"
DESCRIPTION = "LibYAML binding for Lua, with a fast C implementation for converting between YAML 1.1 and Lua tables, \
and a low-level YAML event parser for implementing more intricate YAML document loading."
LICENSE = "MIT"

PV = "6.2.8"

RPM_NAME = "lua53-lyaml-6.2.8-3.3.aarch64.rpm"
RPM_HASH = "08c74c2b2acc16d0d8a02a5a4e4368594398c24b4b88b9213f7177177116a9990c0b75cae78db56264ed29878356775ef05a015da0aa301197c45b3b90512715"

RPROVIDES:${PN} += "lua53-lyaml"

RDEPENDS:${PN} += "libc.so.6 \
libyaml-0.so.2 \
lua53"

inherit rpm
