SUMMARY = "Documentation for texlive-lettrine"
DESCRIPTION = "This package includes the documentation for texlive-lettrine"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.83svn77053"

RPM_NAME = "texlive-lettrine-doc-2026.226.2.83svn77053-61.2.noarch.rpm"
RPM_HASH = "36fc4722e8774afaf09c9ed87477ee58248112cac7ba73dc7e86bcad966f3b855bea08745025e12bb1be7f130f4ef8eaae65bea3eb5c61925622cc9b31a6ef64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lettrine-doc-ar;de;fr \
texlive-lettrine-doc"

RDEPENDS:${PN} += ""

inherit rpm
