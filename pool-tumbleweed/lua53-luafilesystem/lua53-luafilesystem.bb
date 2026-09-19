SUMMARY = "Filesystem support for Lua"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions \
related to file systems offered by the standard Lua distribution. \
 \
LuaFileSystem offers a portable way to access the underlying directory \
structure and file attributes."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "lua53-luafilesystem-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "87cc65d2e834cda2a9507c0aa8e3b3ded8e81fcc810525e119f72ba03839a4464790921fb55e41e669f7695e592299eb96a892d6692b8ec60f3495e10c977a9a"

RPROVIDES:${PN} += "lua53-luafilesystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
