SUMMARY = "Documentation for texlive-newsletr"
DESCRIPTION = "This package includes the documentation for texlive-newsletr"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-newsletr-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "f1f919b3cf1e225f102e0db186ac83d2e22753ea484a9e165dfd7011ab1ef746071a46b6ca080a270b1bc97525ed01c17de27f3c95670b0f2b3e890203e9054d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newsletr-doc"

RDEPENDS:${PN} += ""

inherit rpm
