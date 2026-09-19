SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "lua55-luaposix-35.1-4.3.aarch64.rpm"
RPM_HASH = "58180287424225d07b335f30e6f10a7a181f946355d379205464a3c177267522c6164514f02af358ad56b540e7535a9634c844b133dc7e95b152e719bbf3f6cc"

RPROVIDES:${PN} += "libgen.so \
lua55-luaposix"

RDEPENDS:${PN} += "libc.so.6 \
libcrypt.so.1 \
lua55"

inherit rpm
