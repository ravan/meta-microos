SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.81742"

RPM_NAME = "libtexluajit2-2.1.81742-120.4.aarch64.rpm"
RPM_HASH = "2c6bfaf684ebc03d55b25ed1defe62973bc7a180a7ddbd8e2a816cb2e3afc0a5d662821ddf864c6cf417b86aa8b1f547006a0a8a02d20c30bfe4636d27ca7731"

RPROVIDES:${PN} += "libtexluajit.so.2 \
libtexluajit2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
