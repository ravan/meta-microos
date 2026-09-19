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

RPM_NAME = "lua54-luasocket-3.1.0-5.3.aarch64.rpm"
RPM_HASH = "761867b233c94854acc3d924f7e1a6a2a544f969c41ae8b7612e68d8ab5710482da788bbbe32b76225f0dfcdec65afe15abd647b813c25a2a0bc98712590561b"

RPROVIDES:${PN} += "lua-luasocket \
lua54-luasocket \
luasocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
