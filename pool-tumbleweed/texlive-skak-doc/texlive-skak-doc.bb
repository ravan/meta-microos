SUMMARY = "Documentation for texlive-skak"
DESCRIPTION = "This package includes the documentation for texlive-skak"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.3svn78101"

RPM_NAME = "texlive-skak-doc-2026.226.1.5.3svn78101-64.2.noarch.rpm"
RPM_HASH = "a24d98aa001ecd55581f0a4205a73c13e36ef0981c07c12d3464e4f346efebe5aa308ea47e456efb8564779fd6a30d0cae082af11d3055d35ecd7ae4c8075cc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skak-doc"

RDEPENDS:${PN} += ""

inherit rpm
