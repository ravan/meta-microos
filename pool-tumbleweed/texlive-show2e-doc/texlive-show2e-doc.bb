SUMMARY = "Documentation for texlive-show2e"
DESCRIPTION = "This package includes the documentation for texlive-show2e"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-show2e-doc-2026.226.1.0svn78101-60.2.noarch.rpm"
RPM_HASH = "1c0ba71937e6c4a2a37e5424051d7753483ededf57e757a913d58cf7ad62b269401e9ec9dad96a8c79c5fadb6541fcc58fa2d54833316ba2184464a9d69c6147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-show2e-doc-fr;en \
texlive-show2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
