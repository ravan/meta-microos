SUMMARY = "Library for printing Lua values"
DESCRIPTION = "This library transforms any Lua value into a human-readable representation. It is especially useful for debugging errors in tables. \
 \
The objective here is human understanding (i.e. for debugging), not serialization or compactness."
LICENSE = "MIT"

PV = "3.1.3"

RPM_NAME = "lua54-inspect-3.1.3-3.2.noarch.rpm"
RPM_HASH = "c808f19465fd243191f774ea8cd258e69366545f94da8e59dba0ab3c8f4e7fb12e80e80506b900c87a79222003919bb328e9877ced3382f42caccaa6f2471805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-inspect \
lua54-inspect"

RDEPENDS:${PN} += "lua54"

inherit rpm
