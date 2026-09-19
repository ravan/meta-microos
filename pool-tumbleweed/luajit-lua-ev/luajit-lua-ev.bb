SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "luajit-lua-ev-1.5-7.3.aarch64.rpm"
RPM_HASH = "0dbf986fb5524d54aacc51469b3ee1674847b15c119b6a9e681d37243e0c7eab9a44a329181e10a573c2f96045f668d4e0566e4eb6ea60927fe73894b7454f8a"

RPROVIDES:${PN} += "luajit-lua-ev"

RDEPENDS:${PN} += "libc.so.6 \
libev.so.4 \
libluajit-5.1.so.2 \
luajit"

inherit rpm
