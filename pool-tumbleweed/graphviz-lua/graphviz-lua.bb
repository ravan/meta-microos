SUMMARY = "Lua extension for graphviz"
DESCRIPTION = "The graphviz-lua package contains the lua extension for the graphviz \
tools."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-lua-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "60f788fe3abcd8effe8cfd580edebcc2ea7ad0b4b42329981883b568d3aa4dab989f442a94f4fa127d53bce8bf2b4c3bf410dc73068d93d3e2a64c3b6bc258ae"

RPROVIDES:${PN} += "graphviz-lua \
libgv-lua.so"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
liblua5.4.so.5 \
libstdc++.so.6 \
lua"

inherit rpm
