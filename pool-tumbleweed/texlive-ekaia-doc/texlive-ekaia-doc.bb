SUMMARY = "Documentation for texlive-ekaia"
DESCRIPTION = "This package includes the documentation for texlive-ekaia"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06svn49594"

RPM_NAME = "texlive-ekaia-doc-2026.226.1.06svn49594-61.4.noarch.rpm"
RPM_HASH = "3829a7cb9973cb42ab7ffe661edd4831c28c77680a40e0f5488a7ebc972a64d686998c98ad112651b8c7248ca0f6b31c9c61147a32f65eed85c5b1ac4a55d0b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekaia-doc"

RDEPENDS:${PN} += ""

inherit rpm
