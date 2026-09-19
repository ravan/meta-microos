SUMMARY = "Documentation for texlive-graphicscache"
DESCRIPTION = "This package includes the documentation for texlive-graphicscache"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.4svn65318"

RPM_NAME = "texlive-graphicscache-doc-2026.226.0.0.4svn65318-60.4.noarch.rpm"
RPM_HASH = "ffabd458369fa922e614bc39a0233395178bd2cbbfdd8a6d8222e17bd6bc2f1c2981f792ee42992c633bbde6be618cb86c15e367e7fac81fd4e0c87aabf07556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicscache-doc"

RDEPENDS:${PN} += ""

inherit rpm
