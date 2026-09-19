SUMMARY = "Lua WebSocket implementation for the ngx_lua module"
DESCRIPTION = "This Lua library implements a WebSocket server and client libraries based on the ngx_lua module."
LICENSE = "BSD-2-Clause"

PV = "0.13"

RPM_NAME = "lua-resty-websocket-0.13-1.5.noarch.rpm"
RPM_HASH = "6da6191b8da9c10e0532d1a5c85cf0b4bf2e18addea14c62a0655b8826608bd93fcbd413b9ffdbd787f2e9a117049c159c326ae2f089c36319ed2ce13a5773ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-resty-websocket"

RDEPENDS:${PN} += ""

inherit rpm
