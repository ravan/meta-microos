SUMMARY = "A Lua port of the cassowary constraint solver engine"
DESCRIPTION = "This is a Lua port of the cassowary constraint solving toolkit. \
It allows you to use Lua to solve algebraic equations and inequalities \
and find the values of unknown variables which satisfy those inequalities."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "lua55-cassowary-2.3.2-6.2.noarch.rpm"
RPM_HASH = "0083abc67884d9f55b6d1e7a9816a29eb7b159886a904584468ec5489cd5b5d1aad6f491fe3f00d6a44d9b38cb2bd77d7b87300b66a64928966864ff5512a0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-cassowary"

RDEPENDS:${PN} += "lua55 \
lua55-penlight"

inherit rpm
