SUMMARY = "Documentation for texlive-bxjscls"
DESCRIPTION = "This package includes the documentation for texlive-bxjscls"
LICENSE = "BSD-3-Clause"

PV = "2026.226.2.9dsvn75447"

RPM_NAME = "texlive-bxjscls-doc-2026.226.2.9dsvn75447-59.2.noarch.rpm"
RPM_HASH = "8abfc369794dfe460bf4db0139c2eb7a0277bf711f9b4a75be1c269d865b3b59cb79f55f258e0090a062a04853b8f374338fa170c0b197600ac43b3958e84695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxjscls-doc-ja \
texlive-bxjscls-doc"

RDEPENDS:${PN} += ""

inherit rpm
