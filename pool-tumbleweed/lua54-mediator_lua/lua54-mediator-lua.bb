SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
mediator_lua allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "1.120"

RPM_NAME = "lua54-mediator_lua-1.120-6.2.noarch.rpm"
RPM_HASH = "01eb3505ffcc0b4e8c6dce1142af186544d61345c62c7a4b8f82f4d8f0e944eaf882ce0dfb1d294a20456c3e496f975cc49ec51c169b74c169044cc266ff1309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-mediator-lua \
lua54-mediator-lua"

RDEPENDS:${PN} += "lua54"

inherit rpm
