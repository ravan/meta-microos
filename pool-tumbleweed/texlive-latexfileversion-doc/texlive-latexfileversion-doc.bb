SUMMARY = "Documentation for texlive-latexfileversion"
DESCRIPTION = "This package includes the documentation for texlive-latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn29349"

RPM_NAME = "texlive-latexfileversion-doc-2026.226.0.0.3svn29349-61.2.noarch.rpm"
RPM_HASH = "7431b0b568011042662bdf11d3ed6d35c1f802de64b5a5fbb30553b0d7b5f72aca4f4fc26f34058cf75498e5494f4c2df4d3260f97543988435e06ae3f6f42e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
