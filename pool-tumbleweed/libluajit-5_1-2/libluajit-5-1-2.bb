SUMMARY = "Library for LuaJIT2 compiler"
DESCRIPTION = "Libraries to use LuaJIT2 compiler."
LICENSE = "MIT"

PV = "2.1.20250826"

RPM_NAME = "libluajit-5_1-2-2.1.20250826-3.3.aarch64.rpm"
RPM_HASH = "0b79f1f1074e820663835c6b20a9f8bd1a028269530d10feb675715f9cae5faa1ee73f5386f2709d050ec218026381373f52116e499ad89cf3dec9c49828b71c"

RPROVIDES:${PN} += "liblua.so.5.1 \
libluajit-5-1-2 \
libluajit-5.1.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
