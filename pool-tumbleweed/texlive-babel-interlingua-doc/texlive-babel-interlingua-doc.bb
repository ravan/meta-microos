SUMMARY = "Documentation for texlive-babel-interlingua"
DESCRIPTION = "This package includes the documentation for texlive-babel-interlingua"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-babel-interlingua-doc-2026.226.1.6svn77682-60.2.noarch.rpm"
RPM_HASH = "fdbadb61b371bd9c6c985a3cfa03cddab804b308519ebc95851977d997bb219dca0aed86b8c21cd0835b27ea985dd9ba8d51c8a2af7891c496bea6a8f6c2069a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-interlingua-doc"

RDEPENDS:${PN} += ""

inherit rpm
