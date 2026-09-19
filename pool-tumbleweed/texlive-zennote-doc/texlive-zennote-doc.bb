SUMMARY = "Documentation for texlive-zennote"
DESCRIPTION = "This package includes the documentation for texlive-zennote"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn76924"

RPM_NAME = "texlive-zennote-doc-2026.226.1.0.0svn76924-59.4.noarch.rpm"
RPM_HASH = "84ede6cd09ec7f2ca8a26d876142c69fe6e11a72576e12f020c65f5b7210b25f4d39c25152e2445ce4b0f64ae779966fc2238936c488b344ed031261158a18e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zennote-doc"

RDEPENDS:${PN} += ""

inherit rpm
