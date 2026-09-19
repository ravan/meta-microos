SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "luajit-luaposix-35.1-4.3.aarch64.rpm"
RPM_HASH = "11c733d783e839a3cad75e90e9bf6bbcb8a43b99abf31db21b2fdd645f663ed0fe722bbb506113ea322b66b4fadc6dedf909bea7779062163251bf683ebcfbd4"

RPROVIDES:${PN} += "libgen.so \
luajit-luaposix"

RDEPENDS:${PN} += "libc.so.6 \
libcrypt.so.1 \
luajit"

inherit rpm
