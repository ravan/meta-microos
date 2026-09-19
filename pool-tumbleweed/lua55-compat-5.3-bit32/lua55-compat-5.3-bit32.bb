SUMMARY = "Lua bit manipulation library"
DESCRIPTION = "bit32 is the native Lua 5.2 bit manipulation library, in the version \
from Lua 5.3; it is compatible with Lua 5.1, 5.2 and 5.3."
LICENSE = "MIT"

PV = "5.3.5.1"

RPM_NAME = "lua55-compat-5.3-bit32-5.3.5.1-13.4.aarch64.rpm"
RPM_HASH = "663b72005eee42ae8232212291f80c3563115d5c5d00350959211ad81b6f0f51436bf838c68e2b77c8ed709695222a892f3e50bfa8fb09fc38c95b4a453bb774"

RPROVIDES:${PN} += "lua55-bit32 \
lua55-compat-5.3-bit32"

RDEPENDS:${PN} += ""

inherit rpm
