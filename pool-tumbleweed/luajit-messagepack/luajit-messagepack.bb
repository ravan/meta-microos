SUMMARY = "MessagePack is an efficient binary serialization format"
DESCRIPTION = "MessagePack is an efficient binary serialization format. \
It lets you exchange data among multiple languages like JSON but it's faster and \
smaller. \
It's a pure Lua implementation, without dependency. \
And it's really fast with LuaJIT."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "luajit-messagepack-0.5.2-4.2.noarch.rpm"
RPM_HASH = "8c1f10207a94e0db33e568d39d69574de830bd9e10055297f6acc1e604b19fffb2438b23c7893b6c151f84601ad78b783511f9a68d127674f260026b829caaf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-messagepack"

RDEPENDS:${PN} += "luajit"

inherit rpm
