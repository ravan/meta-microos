SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without \
compromising builtin assertion functionality."
LICENSE = "MIT"

PV = "1.7.11"

RPM_NAME = "lua55-luassert-1.7.11-7.2.noarch.rpm"
RPM_HASH = "efcda5c502d132d67fddd937f2ecc24992efbef4fcfd643e3d90bd8ddf824bcb9dc2c7275210a607248d98c97941a4de840fec1243eede2dd80b7a2248318e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-luassert"

RDEPENDS:${PN} += "lua55"

inherit rpm
