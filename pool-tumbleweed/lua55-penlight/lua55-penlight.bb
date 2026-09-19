SUMMARY = "Generally useful modules inspired by the Python standard libraries"
DESCRIPTION = "A set of pure Lua libraries focusing on input data handling (such as \
reading configuration files), functional programming (such as map, \
reduce, placeholder expressions,etc), and OS path management. Much of \
the functionality is inspired by the Python standard libraries."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "lua55-penlight-1.14.0-3.3.noarch.rpm"
RPM_HASH = "cb0316c7e3fc233c9044d754ddc7a16a4469ddae53811f18b83c09bdca1d0a7230177161486415d34717e529136f3fa5134fda4f0627a2f8e262b6bbf1e5c3a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-penlight"

RDEPENDS:${PN} += "lua55 \
lua55-luafilesystem"

inherit rpm
