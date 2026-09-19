SUMMARY = "Documentation for texlive-asapsym"
DESCRIPTION = "This package includes the documentation for texlive-asapsym"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn40201"

RPM_NAME = "texlive-asapsym-doc-2026.226.1.0svn40201-60.2.noarch.rpm"
RPM_HASH = "ab9ba2673b92c90a8a1627c51826df9afc2c4050da8aa8589d6d388c899cbfc349d4393532dd98439d0c9dec2e36074478535d925aebd1a48f60d5806ade0df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asapsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
