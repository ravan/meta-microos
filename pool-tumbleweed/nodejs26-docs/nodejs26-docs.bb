SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "26.7.0"

RPM_NAME = "nodejs26-docs-26.7.0-1.1.noarch.rpm"
RPM_HASH = "98148fb104eebf138bb710d90b9371f943ca1bfd2f705af0fec6eb3bc3019e511bd8ccbb1fc63d5610596a9d5756be8856842dc010ab38928b3c5eb21801b98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs26-docs"

RDEPENDS:${PN} += ""

inherit rpm
