SUMMARY = "Terminal operations for Lua"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.07"

RPM_NAME = "luajit-luaterm-0.07-10.3.aarch64.rpm"
RPM_HASH = "6c9337a474a408cfc61ec7c67c8510db1b772e30f516e8d325c95e3d89cd837996b7136e3a1d5c0bc0de3c4097f6ca308086b754ba8afdea7651b418e4154b2b"

RPROVIDES:${PN} += "luajit-luaterm"

RDEPENDS:${PN} += "libc.so.6 \
luajit"

inherit rpm
