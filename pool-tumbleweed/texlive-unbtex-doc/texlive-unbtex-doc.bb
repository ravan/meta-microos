SUMMARY = "Documentation for texlive-unbtex"
DESCRIPTION = "This package includes the documentation for texlive-unbtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.7svn76237"

RPM_NAME = "texlive-unbtex-doc-2026.226.1.5.7svn76237-60.2.noarch.rpm"
RPM_HASH = "c6a6b030b2703126ae0979115625fb5a270a61103b685a43f261a2806add885908b6f66b87ce3731afb2dc119368d336c315c322e3ef1c708d59b8a6717243bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-unbtex-doc-pt-BR \
texlive-unbtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
