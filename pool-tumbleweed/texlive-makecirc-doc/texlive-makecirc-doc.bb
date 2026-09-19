SUMMARY = "Documentation for texlive-makecirc"
DESCRIPTION = "This package includes the documentation for texlive-makecirc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-makecirc-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "c3f7da038bb0db8c31629f283bcd16b421cc8c006cc064d88836e941ebbf819095d09c9dd968d7a6dc4426c64dbd604f3a36938bbaa11be1b6a9fb16ff699e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-makecirc-doc-en;es \
texlive-makecirc-doc"

RDEPENDS:${PN} += ""

inherit rpm
