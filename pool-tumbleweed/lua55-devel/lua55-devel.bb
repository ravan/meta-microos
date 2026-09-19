SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "lua55-devel-5.5.0-1.5.aarch64.rpm"
RPM_HASH = "27f444ca1dce2aeb279b285e214510bcf7e4175408b189d98c2bbc5183c5c15ea84bf292a192d7992b151a9917184142b57820894f672f7a3ddffe37f37bf9b2"

RPROVIDES:${PN} += "Lua-devel \
lua-devel \
lua55-devel \
pkgconfig-lua \
pkgconfig-lua5.5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblua5-5-5 \
lua-macros \
lua55"

inherit rpm
