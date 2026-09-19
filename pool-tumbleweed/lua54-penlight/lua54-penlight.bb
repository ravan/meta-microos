SUMMARY = "Generally useful modules inspired by the Python standard libraries"
DESCRIPTION = "A set of pure Lua libraries focusing on input data handling (such as \
reading configuration files), functional programming (such as map, \
reduce, placeholder expressions,etc), and OS path management. Much of \
the functionality is inspired by the Python standard libraries."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "lua54-penlight-1.14.0-3.3.noarch.rpm"
RPM_HASH = "b2ec08515ce0e00e5f8b2962d125622eecf4581a443b201e1fe109967de42250fc72512c0c6f099f1ea2fada0f75ff83d1b97e0bdbcb995196ee6d42eae5114c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-penlight \
lua54-penlight"

RDEPENDS:${PN} += "lua54 \
lua54-luafilesystem"

inherit rpm
