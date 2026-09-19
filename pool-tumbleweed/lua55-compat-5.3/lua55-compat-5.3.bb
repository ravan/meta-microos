SUMMARY = "Lua-5.3-style APIs for Lua 5.2 and 5.1"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.14.4"

RPM_NAME = "lua55-compat-5.3-0.14.4-13.4.aarch64.rpm"
RPM_HASH = "e23c2cce4ed0df5b09510ec300d8d07c7d38934d484b1af5871f33aab6f4a0bd758dc1a9f2c8b952870061d073d20f541c19cf848bcfc141bd97489795c83007"

RPROVIDES:${PN} += "lua55-compat-5.3"

RDEPENDS:${PN} += "libc.so.6 \
lua55 \
lua55-bit32"

inherit rpm
