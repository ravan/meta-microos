SUMMARY = "Documentation for texlive-faktor"
DESCRIPTION = "This package includes the documentation for texlive-faktor"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1bsvn77682"

RPM_NAME = "texlive-faktor-doc-2026.226.0.0.1bsvn77682-59.2.noarch.rpm"
RPM_HASH = "ec19f3ec15044842cff4055cee4428b8949d6630cc81b36f6501969b122222c3ab08c9d6cc8e1d1faec55e2c292ed240d51027934a54117852707a27abe5cdc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-faktor-doc-de \
texlive-faktor-doc"

RDEPENDS:${PN} += ""

inherit rpm
