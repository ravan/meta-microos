SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "lua54-luaexpat-1.5.1-4.3.aarch64.rpm"
RPM_HASH = "5810dd8768637ed9d21d6848b08f238209df502aa576569c2fabcb2d782cd54176e1bd80fe9eecf159064a287bfcdb7b652cbed4154fb65ee798dea4c4254df0"

RPROVIDES:${PN} += "lua-luaexpat \
lua54-luaexpat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
lua54"

inherit rpm
