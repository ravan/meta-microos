SUMMARY = "Documentation for texlive-babel-swedish"
DESCRIPTION = "This package includes the documentation for texlive-babel-swedish"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3esvn77682"

RPM_NAME = "texlive-babel-swedish-doc-2026.226.2.3esvn77682-60.2.noarch.rpm"
RPM_HASH = "61c88c163d1a17682559485bab21ae678bffa289ec6d18a3720b5aded61a7023ede616bcf10577de76b95dab3c3a0e99e0333b38b0f7f6ddeeec08dbb9b0729d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-swedish-doc"

RDEPENDS:${PN} += ""

inherit rpm
