SUMMARY = "Lua bindings for Clingo"
DESCRIPTION = "Lua bindings for Clingo, a grounder and solver for logic programs. \
 \
Detailed information (including a User's manual), source code, and pre-compiled \
binaries are available at: http://potassco.org/"
LICENSE = "MIT"

PV = "5.8.0"

RPM_NAME = "lua-clingo-5.8.0-2.4.aarch64.rpm"
RPM_HASH = "7d005d21df64b70f1907157c8c47f452cc926b2afea70c0096e18496b602c8686368686899a8e9b192a63dbc041607eff18c1bd29b6ac8b5bb4da2c8c5548c85"

RPROVIDES:${PN} += "lua-clingo"

RDEPENDS:${PN} += "clingo \
libc.so.6 \
libclingo.so.4 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6"

inherit rpm
