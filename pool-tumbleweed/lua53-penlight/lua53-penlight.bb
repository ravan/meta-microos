SUMMARY = "Generally useful modules inspired by the Python standard libraries"
DESCRIPTION = "A set of pure Lua libraries focusing on input data handling (such as \
reading configuration files), functional programming (such as map, \
reduce, placeholder expressions,etc), and OS path management. Much of \
the functionality is inspired by the Python standard libraries."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "lua53-penlight-1.14.0-3.3.noarch.rpm"
RPM_HASH = "f6fde3b46385c5e589469abf84a8b21e6b1f39d8634e6aad380d3a14a2f93227fafaee4f2185ab74d298c3f9f6964ae8ffa8ed95e20260e3a33f2acaad494439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-penlight"

RDEPENDS:${PN} += "lua53 \
lua53-luafilesystem"

inherit rpm
