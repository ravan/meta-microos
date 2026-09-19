SUMMARY = "A Lua port of the cassowary constraint solver engine"
DESCRIPTION = "This is a Lua port of the cassowary constraint solving toolkit. \
It allows you to use Lua to solve algebraic equations and inequalities \
and find the values of unknown variables which satisfy those inequalities."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "lua54-cassowary-2.3.2-6.2.noarch.rpm"
RPM_HASH = "685ef7a572dc64855967f39ac6cf2025991c2caae96256b651c234a161e2ad9216318366a5811630606b670a6c88168b72a34b856b3f3de0fda6fc3941fc66be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-cassowary \
lua54-cassowary"

RDEPENDS:${PN} += "lua54 \
lua54-penlight"

inherit rpm
