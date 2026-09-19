SUMMARY = "Documentation for quickjs"
DESCRIPTION = "Documentation for quickjs"
LICENSE = "MIT"

PV = "20260604"

RPM_NAME = "quickjs-docs-20260604-2.3.noarch.rpm"
RPM_HASH = "0c32f2b333f1baed37d76f54813d36449159861e4cddbdfb875ed3eee54165685e3a99481eb9ad226405f501d872795f87fe84349f18bc2ca0c23afa158141cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "quickjs-docs"

RDEPENDS:${PN} += ""

inherit rpm
