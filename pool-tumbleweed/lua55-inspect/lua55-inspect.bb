SUMMARY = "Library for printing Lua values"
DESCRIPTION = "This library transforms any Lua value into a human-readable representation. It is especially useful for debugging errors in tables. \
 \
The objective here is human understanding (i.e. for debugging), not serialization or compactness."
LICENSE = "MIT"

PV = "3.1.3"

RPM_NAME = "lua55-inspect-3.1.3-3.2.noarch.rpm"
RPM_HASH = "a4e46f43c6a1187c0b0b8507cf772f0c2849563db85f75bc6e378e563b6a10f17960d721874f6a718cd1b6e85fe27e8976eae20b20422449fa640488d60d2bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-inspect"

RDEPENDS:${PN} += "lua55"

inherit rpm
