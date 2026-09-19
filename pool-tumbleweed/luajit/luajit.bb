SUMMARY = "JIT compiler for Lua language"
DESCRIPTION = "A Just-In-Time Compiler for Lua language."
LICENSE = "MIT"

PV = "2.1.20250826"

RPM_NAME = "luajit-2.1.20250826-3.3.aarch64.rpm"
RPM_HASH = "4f7bfcfa4be29a896829093f36e0ce1180ce2a7f92da7546b7a6c24640dc5e1219d57f66fedf951db13e5568140ba36f19a8c19b64e2dd7f6e3454cdc0f377e3"

RPROVIDES:${PN} += "Lua-API \
lua \
lua51 \
lua51-luajit \
luajit \
moonjit"

RDEPENDS:${PN} += "alts \
libc.so.6 \
libgcc-s.so.1 \
libluajit-5-1-2 \
libm.so.6 \
lua-interpreter"

inherit rpm
