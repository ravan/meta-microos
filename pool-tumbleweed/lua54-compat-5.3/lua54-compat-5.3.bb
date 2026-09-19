SUMMARY = "Lua-5.3-style APIs for Lua 5.2 and 5.1"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.14.4"

RPM_NAME = "lua54-compat-5.3-0.14.4-13.4.aarch64.rpm"
RPM_HASH = "29e405c99b1aa12916a8b64a39371cf4748cc144a4c591f5c3f7fa64b5bf37ebcdc7c431619e4230d805b95f34f1734fe572a73bd71157c49a8c3142904e472d"

RPROVIDES:${PN} += "lua-compat-5.3 \
lua54-compat-5.3"

RDEPENDS:${PN} += "libc.so.6 \
lua54 \
lua54-bit32"

inherit rpm
