SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
mediator_lua allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "1.120"

RPM_NAME = "lua53-mediator_lua-1.120-6.2.noarch.rpm"
RPM_HASH = "c90c845af1064c81e9fc20867901e9f46c942527720f720c78061b7a2b7961bbd7383ebff9ab04e3fd3110a3218a0a82c074646509480016e1f6ee3d9b2bd709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-mediator-lua"

RDEPENDS:${PN} += "lua53"

inherit rpm
