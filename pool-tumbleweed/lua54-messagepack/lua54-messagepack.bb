SUMMARY = "MessagePack is an efficient binary serialization format"
DESCRIPTION = "MessagePack is an efficient binary serialization format. \
It lets you exchange data among multiple languages like JSON but it's faster and \
smaller. \
It's a pure Lua implementation, without dependency. \
And it's really fast with LuaJIT."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "lua54-messagepack-0.5.2-4.2.noarch.rpm"
RPM_HASH = "0c92fda520d7b1bb36dff7d83b19782a9925f7b94c8e55b72039131205b53f3d26cbaf8381e35086a5d27ca90f4e2ac35d62701a6dbc867380c51d2c6f6a09bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-MessagePack \
lua-messagepack \
lua54-messagepack"

RDEPENDS:${PN} += "lua54"

inherit rpm
