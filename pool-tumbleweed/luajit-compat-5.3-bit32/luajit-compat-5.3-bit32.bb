SUMMARY = "Lua bit manipulation library"
DESCRIPTION = "bit32 is the native Lua 5.2 bit manipulation library, in the version \
from Lua 5.3; it is compatible with Lua 5.1, 5.2 and 5.3."
LICENSE = "MIT"

PV = "5.3.5.1"

RPM_NAME = "luajit-compat-5.3-bit32-5.3.5.1-13.4.aarch64.rpm"
RPM_HASH = "67143d14f71d48a4f66f0d2d353eb5a54b93a4db1644e9fe35a3e13d7bbabc914bdfbb8433188bc539572688c0db53d90aadf18c657cdb6dcd848ce6fc47150b"

RPROVIDES:${PN} += "luajit-bit32 \
luajit-compat-5.3-bit32"

RDEPENDS:${PN} += ""

inherit rpm
