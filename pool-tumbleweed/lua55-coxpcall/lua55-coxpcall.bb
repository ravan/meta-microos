SUMMARY = "Coroutine safe xpcall and pcall"
DESCRIPTION = "Encapsulates the protected calls with a coroutine based loop, so errors \
can be handled without the usual Lua 5.x pcall/xpcall issues with \
coroutines yielding inside the call to pcall or xpcall."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "lua55-coxpcall-1.17.0-6.2.noarch.rpm"
RPM_HASH = "d559e7d566414d877700c522d7c30b83e1c0c6aeba7e87c2f10bf4b837c01e14eaa9457903c6d38bc11759a7e1c82ccbb4634b425e5a0a6576d266dcfbd5abc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-coxpcall"

RDEPENDS:${PN} += "lua55"

inherit rpm
