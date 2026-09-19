SUMMARY = "Filesystem support for Lua"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions \
related to file systems offered by the standard Lua distribution. \
 \
LuaFileSystem offers a portable way to access the underlying directory \
structure and file attributes."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "luajit-luafilesystem-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "ae33218347abd20fd2ff40bae723d241842852c1740573490a73b9fc432952bdedad37fc29b42ff3c468a19b02134472ad566cc5666a58e97d8ea6ebfa91675a"

RPROVIDES:${PN} += "luajit-luafilesystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
luajit"

inherit rpm
