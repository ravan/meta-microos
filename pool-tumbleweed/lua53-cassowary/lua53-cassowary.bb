SUMMARY = "A Lua port of the cassowary constraint solver engine"
DESCRIPTION = "This is a Lua port of the cassowary constraint solving toolkit. \
It allows you to use Lua to solve algebraic equations and inequalities \
and find the values of unknown variables which satisfy those inequalities."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "lua53-cassowary-2.3.2-6.2.noarch.rpm"
RPM_HASH = "dd3b30bbe936d654735ff1aac1f11c6ef865f6ff75a91c3157529c04e2bec40eeeb376a3f1230493c81a0843555ce66b6c74aa44809afe53c452834266c791ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cassowary"

RDEPENDS:${PN} += "lua53 \
lua53-penlight"

inherit rpm
