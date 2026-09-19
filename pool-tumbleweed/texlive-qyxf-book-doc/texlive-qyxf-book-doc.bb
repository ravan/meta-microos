SUMMARY = "Documentation for texlive-qyxf-book"
DESCRIPTION = "This package includes the documentation for texlive-qyxf-book"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.0svn75712"

RPM_NAME = "texlive-qyxf-book-doc-2026.226.3.1.0svn75712-60.4.noarch.rpm"
RPM_HASH = "99e499f5ff6a9bcde90e1f1ca71dcc8a4edac6a8061dd9a430608668fd8401091e96fa5f342cc97c807eebd12c81f4179b8240529018a9616f6deed4339c9975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qyxf-book-doc-zh \
texlive-qyxf-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
