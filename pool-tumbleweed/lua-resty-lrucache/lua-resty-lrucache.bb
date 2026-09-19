SUMMARY = "Lua-land LRU cache based on the LuaJIT FFI"
DESCRIPTION = "This library implements a simple LRU cache for OpenResty and the ngx_lua module."
LICENSE = "BSD-2-Clause"

PV = "0.15"

RPM_NAME = "lua-resty-lrucache-0.15-1.6.noarch.rpm"
RPM_HASH = "8c40c16c9d8018d11f35445bf4b70bc6cbb86f8ecc4ba4bba177db2dd024c1558afd6e586ddb1770c7896fde1885d78f50681e3f32a3e627e7a39993004ee405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-resty-lrucache"

RDEPENDS:${PN} += ""

inherit rpm
