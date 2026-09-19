SUMMARY = "Platform independent system calls for Lua"
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "lua53-luasystem-0.6.3-2.3.aarch64.rpm"
RPM_HASH = "4d1c4e96dd030f57a7470555c77b9b2c019548f84db4f9b400a7dfb1c17d766d24b92d4b89e3da1c53d54e534730842767bf2f779f16bedadfe6594d0520d96f"

RPROVIDES:${PN} += "lua53-luasystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
