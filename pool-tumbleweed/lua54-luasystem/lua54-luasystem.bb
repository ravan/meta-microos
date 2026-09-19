SUMMARY = "Platform independent system calls for Lua"
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "lua54-luasystem-0.6.3-2.3.aarch64.rpm"
RPM_HASH = "9cd29aff3df09a78fb51a50d33304773ed4b865149613fd235703cfabf8d14f7c24ee9fa9456c02d898d6ec3d9e1a76baf8d6d68b988fc2f69836d188bced4cc"

RPROVIDES:${PN} += "lua-luasystem \
lua54-luasystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
