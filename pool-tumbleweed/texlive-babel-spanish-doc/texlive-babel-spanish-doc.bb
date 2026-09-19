SUMMARY = "Documentation for texlive-babel-spanish"
DESCRIPTION = "This package includes the documentation for texlive-babel-spanish"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0qsvn77682"

RPM_NAME = "texlive-babel-spanish-doc-2026.226.5.0qsvn77682-60.2.noarch.rpm"
RPM_HASH = "591a1fc8b9cf2c4f5f4ba5560b760830cb04e3a21b083b0fc9807a15df4debae21428a63c55fabfd5a36c3a4b59a866fd7713a777c2f56d4a87eb406c7b98019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-babel-spanish-doc-es \
texlive-babel-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
