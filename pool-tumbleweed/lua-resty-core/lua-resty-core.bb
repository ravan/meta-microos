SUMMARY = "Lua API for ngx_http_lua_module and/or ngx_stream_lua_module"
DESCRIPTION = "This pure Lua library reimplements part of the ngx_lua module's Nginx API for Lua with LuaJIT FFI \
and installs the new FFI-based Lua API into the ngx.* and ndk.* namespaces used by the ngx_lua module."
LICENSE = "BSD-2-Clause"

PV = "0.1.31"

RPM_NAME = "lua-resty-core-0.1.31-1.6.noarch.rpm"
RPM_HASH = "112544ccc786f0bff5883796e589a57003a30e4b36cc439fd98f076b77b42babfcd78d167a1e4d444cd4065222e5e289dbc3954589871bf629c0c9c306f961b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-resty-core"

RDEPENDS:${PN} += ""

inherit rpm
