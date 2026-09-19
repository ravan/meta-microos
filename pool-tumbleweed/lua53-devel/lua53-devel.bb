SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "lua53-devel-5.3.6-4.7.aarch64.rpm"
RPM_HASH = "b52095205199facb706e1999dbb745c3ca2735d6b9899379f22e16c5d8cb826750e7c326a6e46c1150c5358dad2806ad4383c3708182ef8f8565fb7926876595"

RPROVIDES:${PN} += "Lua-devel \
lua-devel \
lua53-devel \
pkgconfig-lua \
pkgconfig-lua5.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblua5-3-5 \
lua-macros \
lua53"

inherit rpm
