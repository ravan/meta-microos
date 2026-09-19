SUMMARY = "Lua library to manipulate binary data"
DESCRIPTION = "A Lua library for packing and unpacking binary data, supporting arbitrary \
(byte-aligned) widths, named fields, and repetition."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "lua54-vstruct-2.2.0-4.2.noarch.rpm"
RPM_HASH = "439d8c338eb7ba1c64f72facb59912dee03bb01488985cf1ed7c226d491d66f0963e78d893810493057fd2856cb2fc97631b7bfff86e6da56b1f143173b73fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-vstruct \
lua54-vstruct"

RDEPENDS:${PN} += "lua54"

inherit rpm
