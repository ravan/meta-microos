SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
mediator_lua allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "1.120"

RPM_NAME = "luajit-mediator_lua-1.120-6.2.noarch.rpm"
RPM_HASH = "cf911d1ef85f4485f1ff5d87e000cb7eb028de6774843be3c048ca4eb56cc70cd9b3e37f46675f211cd7ec051ef0e9b27fbd02881f90001433ddd0645f675efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-mediator-lua"

RDEPENDS:${PN} += "luajit"

inherit rpm
