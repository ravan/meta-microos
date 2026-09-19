SUMMARY = "JavaScript regular expressions for Lua"
DESCRIPTION = "Provides ECMAScript regular expressions for Lua 5.1, 5.2, 5.3, \
5.4 and LuaJit. Uses libregexp from Fabrice Bellard's QuickJS."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "luajit-jsregexp-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "6f712fdfbd9f99e1a663f6d4a515297cf795bd06a3c2b107cc8d4f7747450bfaab7f1257c19030fc43059933bbf7bbbfcd963f7fd9d444bc3c2e586c20c748c9"

RPROVIDES:${PN} += "luajit-jsregexp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
luajit"

inherit rpm
