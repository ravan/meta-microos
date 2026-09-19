SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without \
compromising builtin assertion functionality."
LICENSE = "MIT"

PV = "1.7.11"

RPM_NAME = "luajit-luassert-1.7.11-7.2.noarch.rpm"
RPM_HASH = "398fa22f9f54acfc0792a3b3d00677efa96c269ba0a765489899deabf1282d02ef09ea38d31fc1e3d8568d2079dfad5275583e2d3a8495462d0af723845f01ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-luassert"

RDEPENDS:${PN} += "luajit"

inherit rpm
