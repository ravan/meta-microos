SUMMARY = "MessagePack is an efficient binary serialization format"
DESCRIPTION = "MessagePack is an efficient binary serialization format. \
It lets you exchange data among multiple languages like JSON but it's faster and \
smaller. \
It's a pure Lua implementation, without dependency. \
And it's really fast with LuaJIT."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "lua55-messagepack-0.5.2-4.2.noarch.rpm"
RPM_HASH = "caaa50d47e8b70aa98c6bef2de4a1d22d58efb7a6f3819dab6d3fa893a2c0551dc8b6abf9dbb4ffc86b9ff6e196dfdaf85d36fc8411dc79a46d9f2a851490633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-messagepack"

RDEPENDS:${PN} += "lua55"

inherit rpm
