SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "lua54-luaposix-35.1-4.3.aarch64.rpm"
RPM_HASH = "190f5638fe92b302356427f1fbbb194de766c06a7adfa880fd8ab94daaab8da4eee5efc5feb411cbb4764632c9fdc4eb85f923fdb40a62b8c0c77d59c9085a64"

RPROVIDES:${PN} += "libgen.so \
lua-luaposix \
lua54-luaposix"

RDEPENDS:${PN} += "libc.so.6 \
libcrypt.so.1 \
lua54"

inherit rpm
