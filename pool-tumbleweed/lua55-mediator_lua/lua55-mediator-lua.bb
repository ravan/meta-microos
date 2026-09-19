SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
mediator_lua allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "1.120"

RPM_NAME = "lua55-mediator_lua-1.120-6.2.noarch.rpm"
RPM_HASH = "1ef7d1aa8e557a93fe2437058102fd1d84d7ac0bfd17aa001eb9d04eaaf977c4f1936af191f7ebb686f8da597b7dffed1cfa55778fa1f9e72986dbfdedeb1dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-mediator-lua"

RDEPENDS:${PN} += "lua55"

inherit rpm
