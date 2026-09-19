SUMMARY = "Documentation for texlive-maker"
DESCRIPTION = "This package includes the documentation for texlive-maker"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-maker-doc-2026.226.1.0svn76924-59.2.noarch.rpm"
RPM_HASH = "93341536b7ad2a6247001cb2e3b4fd9cab2186e784f6031de1c79446a720aa7f2ad27a8badf6fb45a8094437ad6f1a43f7cd63004f74ab03b3382aaa5dc94dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maker-doc"

RDEPENDS:${PN} += ""

inherit rpm
