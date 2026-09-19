SUMMARY = "Documentation for texlive-suanpan"
DESCRIPTION = "This package includes the documentation for texlive-suanpan"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-suanpan-doc-2026.226.svn15878-64.2.noarch.rpm"
RPM_HASH = "dc13744c07bc1ecf118229e8277d54bfe3363e71d05fc93ad10f90307ea69d4429b00c95907e800b721f7af3bebc908eebce503953e327f3bb8f6442ffdcd7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suanpan-doc"

RDEPENDS:${PN} += ""

inherit rpm
