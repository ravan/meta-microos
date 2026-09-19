SUMMARY = "Filesystem support for Lua"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions \
related to file systems offered by the standard Lua distribution. \
 \
LuaFileSystem offers a portable way to access the underlying directory \
structure and file attributes."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "lua54-luafilesystem-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "b732ff2f5d85cd30b45bcc58b723cd4cf6a91eaabd8387651be29c9946d7b1cf2bc086b9eab953e167d5b545765e3619755692736ae840e737ae61f47b1756fb"

RPROVIDES:${PN} += "lua-luafilesystem \
lua54-luafilesystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
