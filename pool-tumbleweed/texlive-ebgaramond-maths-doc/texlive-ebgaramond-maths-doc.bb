SUMMARY = "Documentation for texlive-ebgaramond-maths"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond-maths"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-ebgaramond-maths-doc-2026.226.1.3svn77682-61.4.noarch.rpm"
RPM_HASH = "82cd81d861438a7d4fedd9af97de7acdc01eda0020e85099f6da5f88c7d0ddeb4aeaeb0f46eac99af30f6821ab5fff4fd9cbb5410c1c84abb5b209ae39a4eaef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-maths-doc"

RDEPENDS:${PN} += ""

inherit rpm
