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

RPM_NAME = "luajit-luasocket-3.1.0-5.3.aarch64.rpm"
RPM_HASH = "f0be3e71d8cacb28acec9e75ce89c7d5347044d5f78b181f5b9a74895644946d54f86d60a40f1ef405cff3e3fc6f626c236f976a03eb851b2788b7cf6a77ee9e"

RPROVIDES:${PN} += "luajit-luasocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
luajit"

inherit rpm
