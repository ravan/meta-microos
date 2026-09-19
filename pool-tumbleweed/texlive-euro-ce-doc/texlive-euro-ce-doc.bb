SUMMARY = "Documentation for texlive-euro-ce"
DESCRIPTION = "This package includes the documentation for texlive-euro-ce"
LICENSE = "BSD-3-Clause"

PV = "2026.226.3.0bsvn25714"

RPM_NAME = "texlive-euro-ce-doc-2026.226.3.0bsvn25714-59.2.noarch.rpm"
RPM_HASH = "98e9755a28e1713483b6eb828be6ce24a4e948e4e0c9b82a4bd279f8ae07df5d0c9f3f65c063425ec96a08f446976f6301afe13b79a04849652ea3072a047716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euro-ce-doc"

RDEPENDS:${PN} += ""

inherit rpm
