SUMMARY = "JavaScript regular expressions for Lua"
DESCRIPTION = "Provides ECMAScript regular expressions for Lua 5.1, 5.2, 5.3, \
5.4 and LuaJit. Uses libregexp from Fabrice Bellard's QuickJS."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua55-jsregexp-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "8c83ec683981ab73202dd6d40028f65579ebabf4415d76d42dbcbd2ab518dc50ec2e7611ec8ea50ec32f19da1f19ad8e891ca3fd9e5203972ea81fc6c8dd6708"

RPROVIDES:${PN} += "lua55-jsregexp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua55"

inherit rpm
