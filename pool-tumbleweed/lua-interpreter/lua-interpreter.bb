SUMMARY = "Shared superstructure for Lua interpreters"
DESCRIPTION = "Shared package owning resources shared among Lua interpreters."
LICENSE = "MIT"

PV = "5"

RPM_NAME = "lua-interpreter-5-3.4.noarch.rpm"
RPM_HASH = "d87b56e3a0d8329557dbdab6f7a916efcc4b06718c2260883e4c3f352de1aa52989a492265b29e75d2e5abf9a9167e5a1a50e7be35ba71d12b2a6568abee989e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-interpreter"

RDEPENDS:${PN} += "alts \
lua"

inherit rpm
