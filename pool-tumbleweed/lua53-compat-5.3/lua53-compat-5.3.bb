SUMMARY = "Lua-5.3-style APIs for Lua 5.2 and 5.1"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.14.4"

RPM_NAME = "lua53-compat-5.3-0.14.4-13.4.aarch64.rpm"
RPM_HASH = "15a29a77dd0f1366ba1c2e5d86b8c25e46d574a9ce139df26916402eb65a00b4ff3833a31149614c83b7da77e740427699061abf125a99c648390693f59027e6"

RPROVIDES:${PN} += "lua53-compat-5.3"

RDEPENDS:${PN} += "libc.so.6 \
lua53"

inherit rpm
