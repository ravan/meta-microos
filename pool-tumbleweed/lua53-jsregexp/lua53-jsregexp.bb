SUMMARY = "JavaScript regular expressions for Lua"
DESCRIPTION = "Provides ECMAScript regular expressions for Lua 5.1, 5.2, 5.3, \
5.4 and LuaJit. Uses libregexp from Fabrice Bellard's QuickJS."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua53-jsregexp-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "b1dd5529ff16197d6c2f777ff9881367ebb11ff6905e98556364284e3c862584724b7215246e0a9e68ac8c4a6fe818232a16ecdb9c9ecb0d84ab437a65b4e710"

RPROVIDES:${PN} += "lua53-jsregexp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
