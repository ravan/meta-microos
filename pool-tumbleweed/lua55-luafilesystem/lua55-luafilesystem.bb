SUMMARY = "Filesystem support for Lua"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions \
related to file systems offered by the standard Lua distribution. \
 \
LuaFileSystem offers a portable way to access the underlying directory \
structure and file attributes."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "lua55-luafilesystem-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "9127786856a0f74b4491cf25b5d24a177ac28088c616a40f6d59a46fb2bd706e11d51d5b86d8236bf3664edb8c2f948ef0fd20d4ed0b3b992eaa30d2b6ebe80d"

RPROVIDES:${PN} += "lua55-luafilesystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua55"

inherit rpm
