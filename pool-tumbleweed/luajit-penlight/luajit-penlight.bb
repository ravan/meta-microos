SUMMARY = "Generally useful modules inspired by the Python standard libraries"
DESCRIPTION = "A set of pure Lua libraries focusing on input data handling (such as \
reading configuration files), functional programming (such as map, \
reduce, placeholder expressions,etc), and OS path management. Much of \
the functionality is inspired by the Python standard libraries."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "luajit-penlight-1.14.0-3.3.noarch.rpm"
RPM_HASH = "1f69eddbee8a78a9499771250a73fd71057eafb838862112bae5c6dc6aafb8f14ad190fb169a885479f9376c07844c1d071f98cfa20f6ced7075560be042e418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-penlight"

RDEPENDS:${PN} += "luajit \
luajit-luafilesystem"

inherit rpm
