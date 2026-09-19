SUMMARY = "Library for printing Lua values"
DESCRIPTION = "This library transforms any Lua value into a human-readable representation. It is especially useful for debugging errors in tables. \
 \
The objective here is human understanding (i.e. for debugging), not serialization or compactness."
LICENSE = "MIT"

PV = "3.1.3"

RPM_NAME = "lua53-inspect-3.1.3-3.2.noarch.rpm"
RPM_HASH = "9bc992ce6d9faff84dc9eab84a8de41e07369321a95419c5558eddd89d5c5bb1b1de9be4ddf22747b09c50140f991276134c1dd9eb61eac2721a9e0951c321b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-inspect"

RDEPENDS:${PN} += "lua53"

inherit rpm
