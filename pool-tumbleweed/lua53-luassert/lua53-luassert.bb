SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without \
compromising builtin assertion functionality."
LICENSE = "MIT"

PV = "1.7.11"

RPM_NAME = "lua53-luassert-1.7.11-7.2.noarch.rpm"
RPM_HASH = "3f6c7d23a8c4315e45de77ba75a5e7435afe18071458be64c64a113daed1a67ed28dabadbb23a589204c8a761c69eb7bbcb6866b90876141325a52d6939faf27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luassert"

RDEPENDS:${PN} += "lua53"

inherit rpm
