SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "lua53-luaposix-35.1-4.3.aarch64.rpm"
RPM_HASH = "d85e726aa492244b850f4f236c5cd955576ba5b8c9bbc21c9a361cb32a9222a7ab0afefaa574dd8cc36d030c9027cf58e7d1db1de88c8cfa96e99c4bad3652ce"

RPROVIDES:${PN} += "libgen.so \
lua53-luaposix"

RDEPENDS:${PN} += "libc.so.6 \
libcrypt.so.1 \
lua53"

inherit rpm
