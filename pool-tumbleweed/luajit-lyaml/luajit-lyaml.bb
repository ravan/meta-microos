SUMMARY = "LibYAML binding for Lua"
DESCRIPTION = "LibYAML binding for Lua, with a fast C implementation for converting between YAML 1.1 and Lua tables, \
and a low-level YAML event parser for implementing more intricate YAML document loading."
LICENSE = "MIT"

PV = "6.2.8"

RPM_NAME = "luajit-lyaml-6.2.8-3.3.aarch64.rpm"
RPM_HASH = "524f766dc247b2dd8cf5aa9d6b929e8e47d1dc822ef0e28833c326a0c4bccfa0c07c2d9990858b5bb3f1eac13ae1b8b3a889578d5305ecacd98557c89b9a5606"

RPROVIDES:${PN} += "luajit-lyaml"

RDEPENDS:${PN} += "libc.so.6 \
libyaml-0.so.2 \
luajit"

inherit rpm
