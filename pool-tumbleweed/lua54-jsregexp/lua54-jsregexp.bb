SUMMARY = "JavaScript regular expressions for Lua"
DESCRIPTION = "Provides ECMAScript regular expressions for Lua 5.1, 5.2, 5.3, \
5.4 and LuaJit. Uses libregexp from Fabrice Bellard's QuickJS."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua54-jsregexp-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "168175f1560571df2418f8ea9c48df1aecfc69381c9577c6752331be47bd10e473e16b750520e0749578b76c40f0c63ae92567d9539725c7f2135fc807138cce"

RPROVIDES:${PN} += "lua-jsregexp \
lua54-jsregexp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
