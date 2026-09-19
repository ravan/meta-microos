SUMMARY = "Lua redis client driver for the ngx_lua based on the cosocket API"
DESCRIPTION = "This Lua library is a Redis client driver for the ngx_lua nginx module."
LICENSE = "BSD-2-Clause"

PV = "0.33"

RPM_NAME = "lua-resty-redis-0.33-1.4.noarch.rpm"
RPM_HASH = "c27777b330f798f293b7336bcaf4d4e2a71b735cae4bcc3a4af9b79dc0fde55e39800b9d8a625cf16ab8f8c3de27730ef69ee13911ef92086b2ba99f5a8aa661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-resty-redis"

RDEPENDS:${PN} += ""

inherit rpm
