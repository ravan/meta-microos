SUMMARY = "LuaJIT bindings for the efl"
DESCRIPTION = "A set of efl bindings for the LuaJIT environment."
LICENSE = "LGPL-2.1-only"

PV = "1.26.3"

RPM_NAME = "elua-1.26.3-37.1.aarch64.rpm"
RPM_HASH = "5d1f5cca70ad5acfbf8fae476234c1da8b3ce351daad4f6d3a1117a6c1b7a8655ac78f68787410257a149a754c742bd845a7d702007dcca22d287a0f62ea13ae"

RPROVIDES:${PN} += "elua"

RDEPENDS:${PN} += "efl"

inherit rpm
