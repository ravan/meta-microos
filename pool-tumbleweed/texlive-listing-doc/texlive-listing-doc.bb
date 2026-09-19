SUMMARY = "Documentation for texlive-listing"
DESCRIPTION = "This package includes the documentation for texlive-listing"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn17373"

RPM_NAME = "texlive-listing-doc-2026.226.1.2svn17373-61.2.noarch.rpm"
RPM_HASH = "a1ca804be35122ad9a9d8c9124dbdba7c34e5082beeaf463f5a2e976c319488bb5f412e28497b0ab1cf71bd5c11e0073d5596c63262001af8502d9badb19a606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listing-doc"

RDEPENDS:${PN} += ""

inherit rpm
