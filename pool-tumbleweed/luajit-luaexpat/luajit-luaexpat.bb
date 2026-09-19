SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "luajit-luaexpat-1.5.1-4.3.aarch64.rpm"
RPM_HASH = "80614e937f6b4d30514b50ce065eea46f1153a1c1b24a7d8542ea3d9d40b600d677906d074e3a6bf06a6a30f5bdf5f40de595b2d680548c0cdf258bcf6068ab2"

RPROVIDES:${PN} += "luajit-luaexpat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
luajit"

inherit rpm
