SUMMARY = "Coroutine safe xpcall and pcall"
DESCRIPTION = "Encapsulates the protected calls with a coroutine based loop, so errors \
can be handled without the usual Lua 5.x pcall/xpcall issues with \
coroutines yielding inside the call to pcall or xpcall."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "lua54-coxpcall-1.17.0-6.2.noarch.rpm"
RPM_HASH = "125b830e8bc32db68f0a2a9b1684021045d824575de3f8af7a6c4c43cff9b07b47b04422c67a083afde1eee3c726d04668e13c73463e30440d554a02cc2ab1bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-coxpcall \
lua54-coxpcall"

RDEPENDS:${PN} += "lua54"

inherit rpm
