SUMMARY = "Embed the power of Lua into Nginx HTTP Servers"
DESCRIPTION = "This module embeds LuaJIT 2.1 into Nginx. It is a core component of OpenResty. \
Used to handle requests to upstream services such as MySQL, Redis and other services."
LICENSE = "BSD-2-Clause"

PV = "0.10.29"

RPM_NAME = "nginx-module-lua-0.10.29-1.16.aarch64.rpm"
RPM_HASH = "a49665a6df0be38c6226162538a332e5f056cb6425f0c7d487813ee0abb9a36ae309389f29aa93b7d9b5464219cde2491515df015840f6eb52bba6441549c0a9"

RPROVIDES:${PN} += "nginx-module-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
lua-resty-core \
lua-resty-lrucache \
nginx"

inherit rpm
