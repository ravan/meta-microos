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

RPM_NAME = "lua55-luasocket-3.1.0-5.3.aarch64.rpm"
RPM_HASH = "ac8742517605e88735c29b5dd94d045daa6d090618b49442da3db2eaaad3756f598eb9b7abd521f24bceb96e3e87827289458cd799a4bfb9e07958e54092c409"

RPROVIDES:${PN} += "lua55-luasocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua55"

inherit rpm
