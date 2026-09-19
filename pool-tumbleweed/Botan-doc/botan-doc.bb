SUMMARY = "Documentation of Botan"
DESCRIPTION = "Documentation of Botan package."
LICENSE = "BSD-2-Clause"

PV = "3.13.0"

RPM_NAME = "Botan-doc-3.13.0-1.1.noarch.rpm"
RPM_HASH = "ee008f2142b8b4a688f3a5e08112d9a6730670fa8c2a32da8b5dd1c89e8c7da7cf52173b6eae4873b99e92c92b449b6926b24b5ac76e68bce1471d709df7444b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Botan-doc"

RDEPENDS:${PN} += ""

inherit rpm
