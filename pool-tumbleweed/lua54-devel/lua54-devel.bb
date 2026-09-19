SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.4.8"

RPM_NAME = "lua54-devel-5.4.8-4.7.aarch64.rpm"
RPM_HASH = "904f3a8ab9fa5b4d377bcbcc8c5d8ef966806295c16b1a639f37b1f7ea0fd167bb471cf288ea374486e1c357aa1f5f968f725999fe99e402dc6c3a72d8fad759"

RPROVIDES:${PN} += "Lua-devel \
lua-devel \
lua54-devel \
pkgconfig-lua \
pkgconfig-lua5.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblua5-4-5 \
lua-macros \
lua54"

inherit rpm
