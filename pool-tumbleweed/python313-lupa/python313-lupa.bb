SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "2.8"

RPM_NAME = "python313-lupa-2.8-1.4.aarch64.rpm"
RPM_HASH = "7102f0c84a30768af1ccb45d0366b7074186f4589fc381558897d03e5a898578255be11c12549b1230f586e5916275681aa83e55faedeb9d9c19c9ab6abac5d5"

RPROVIDES:${PN} += "python3-lupa \
python3.13dist-lupa \
python313-lupa \
python3dist-lupa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
python-abi"

inherit rpm
