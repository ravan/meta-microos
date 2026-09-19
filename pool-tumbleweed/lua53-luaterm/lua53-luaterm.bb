SUMMARY = "Terminal operations for Lua"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.07"

RPM_NAME = "lua53-luaterm-0.07-10.3.aarch64.rpm"
RPM_HASH = "4e0f832acbd1956ced67dfdbd8a67fa0675f3cfea5e0a54ff966cc8b50666c2a6f12a9bf7ca97dd0c5d72625a15f1cb4d259b7f3c1ecfc9a83cde58f93f9f138"

RPROVIDES:${PN} += "lua53-luaterm"

RDEPENDS:${PN} += "libc.so.6 \
lua53"

inherit rpm
