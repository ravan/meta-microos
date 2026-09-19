SUMMARY = "Network support for the Lua language"
DESCRIPTION = "LuaSocket is a Lua extension library that is composed by two parts: a C core \
that provides support for the TCP and UDP transport layers, and a set of Lua \
modules that add support for functionality commonly needed by applications \
that deal with the Internet. \
 \
Among the support modules, the most commonly used implement the SMTP, HTTP \
and FTP. In addition there are modules for MIME, URL handling and LTN12."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua53-luasocket-3.1.0-5.3.aarch64.rpm"
RPM_HASH = "0eeedf2375b929f9da9d544b950e0e769c5f05b981811152b94075ade274e4973e59a2206c490f2b92f5296fad947f41fd125166b7dbd36cfb88627d3453e527"

RPROVIDES:${PN} += "lua53-luasocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
