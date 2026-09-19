SUMMARY = "Lua bit manipulation library"
DESCRIPTION = "bit32 is the native Lua 5.2 bit manipulation library, in the version \
from Lua 5.3; it is compatible with Lua 5.1, 5.2 and 5.3."
LICENSE = "MIT"

PV = "5.3.5.1"

RPM_NAME = "lua54-compat-5.3-bit32-5.3.5.1-13.4.aarch64.rpm"
RPM_HASH = "956b23b3aa4fc678636a60f5f6cece9e0f2181a8c5b36b6a7c14e32ea132050e9fae611e28097f0819f1114da8cc1433f5bf0c5f9628665e86832736ced4bf62"

RPROVIDES:${PN} += "lua-bit32 \
lua54-bit32 \
lua54-compat-5.3-bit32"

RDEPENDS:${PN} += ""

inherit rpm
