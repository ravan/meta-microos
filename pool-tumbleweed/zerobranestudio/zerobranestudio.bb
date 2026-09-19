SUMMARY = "Lightweight Lua IDE"
DESCRIPTION = "ZeroBrane Studio is a lightweight cross-platform Lua IDE with code completion, \
syntax highlighting, remote debugger, code analyzer, live coding, and debugging \
support for several Lua engines (LuaJIT, Love 2D, Moai, Gideros, Corona, \
Marmalade Quick, Cocos2d-x, GSL-shell, Adobe Lightroom, OpenResty/Nginx and \
others). It originated from the Estrela Editor."
LICENSE = "MIT"

PV = "2.01"

RPM_NAME = "zerobranestudio-2.01-2.3.noarch.rpm"
RPM_HASH = "7490b7f90e900045c2131dbf130bc835f9c9841bfec28ef2c717b704c601031366f5278fa35254052877391ec701f5b618f6bc8b00b2eeb91cfa05e0bf00f64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zbstudio \
zerobrane-studio \
zerobranestudio"

RDEPENDS:${PN} += "/usr/bin/bash \
Lua-API \
libwxlua \
lua54-copas \
lua54-lpeg \
lua54-luafilesystem \
lua54-luasec \
lua54-luasocket"

inherit rpm
