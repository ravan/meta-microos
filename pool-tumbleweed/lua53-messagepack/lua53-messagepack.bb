SUMMARY = "MessagePack is an efficient binary serialization format"
DESCRIPTION = "MessagePack is an efficient binary serialization format. \
It lets you exchange data among multiple languages like JSON but it's faster and \
smaller. \
It's a pure Lua implementation, without dependency. \
And it's really fast with LuaJIT."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "lua53-messagepack-0.5.2-4.2.noarch.rpm"
RPM_HASH = "63d74cf6efa06c096293770ef29077f82b262e78ee16617272896da40eec51da7690412c81015c01db3a5039315700d2c79c764bbbbfd014cd5ae26561e7a3b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-messagepack"

RDEPENDS:${PN} += "lua53"

inherit rpm
