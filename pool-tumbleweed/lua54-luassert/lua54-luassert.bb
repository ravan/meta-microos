SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without \
compromising builtin assertion functionality."
LICENSE = "MIT"

PV = "1.7.11"

RPM_NAME = "lua54-luassert-1.7.11-7.2.noarch.rpm"
RPM_HASH = "3caab5102ede457afeeffbdfd99e5d9db1d0e1ac0343eb6e03d965b48c329e5b2bc5506ed96ff6cd65a486399af5449b5570fd4a2d2ecbc6b0c58f281bea7ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luassert \
lua54-luassert"

RDEPENDS:${PN} += "lua54"

inherit rpm
