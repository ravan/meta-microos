SUMMARY = "Library for printing Lua values"
DESCRIPTION = "This library transforms any Lua value into a human-readable representation. It is especially useful for debugging errors in tables. \
 \
The objective here is human understanding (i.e. for debugging), not serialization or compactness."
LICENSE = "MIT"

PV = "3.1.3"

RPM_NAME = "luajit-inspect-3.1.3-3.2.noarch.rpm"
RPM_HASH = "e1b5d2315109f642516e38c8b2ef38c541d0d1dc6217e17218c6ccdfacfac26238246da637da458116df7fc6594102aab3404f1837c9e94f214396e57d83ce6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-inspect"

RDEPENDS:${PN} += "luajit"

inherit rpm
