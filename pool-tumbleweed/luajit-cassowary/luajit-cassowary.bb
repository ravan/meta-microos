SUMMARY = "A Lua port of the cassowary constraint solver engine"
DESCRIPTION = "This is a Lua port of the cassowary constraint solving toolkit. \
It allows you to use Lua to solve algebraic equations and inequalities \
and find the values of unknown variables which satisfy those inequalities."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "luajit-cassowary-2.3.2-6.2.noarch.rpm"
RPM_HASH = "09c97e86409d3412878e229c06891d8cc2b0b01dbae1639e43275999325eaa038eb83739544215b1a8953e2b8c260659b34e78245f3f5c3da495ce405641f5fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-cassowary"

RDEPENDS:${PN} += "luajit \
luajit-penlight"

inherit rpm
