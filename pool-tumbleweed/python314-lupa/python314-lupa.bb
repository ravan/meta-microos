SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "2.8"

RPM_NAME = "python314-lupa-2.8-1.4.aarch64.rpm"
RPM_HASH = "7daa8088e790aa01180c4f1f621edd8ee994c062450811f871c895c243934321f9bbde83713ecc420ebbe8f0f6afcce0607592a7388e2dd847e4a0053d929cf8"

RPROVIDES:${PN} += "python3.14dist-lupa \
python314-lupa \
python3dist-lupa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
python-abi"

inherit rpm
