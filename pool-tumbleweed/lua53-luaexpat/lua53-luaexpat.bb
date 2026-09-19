SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "lua53-luaexpat-1.5.1-4.3.aarch64.rpm"
RPM_HASH = "c3f1e7395794b7eabcd6c25eb46bd7c40dcc7872ff880baab324de49b3568fa13b7ad6f5509770a16dd4c4f33df05d4b80c306aa61814f1645aa77a9a1a05c44"

RPROVIDES:${PN} += "lua53-luaexpat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
lua53"

inherit rpm
