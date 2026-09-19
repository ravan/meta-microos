SUMMARY = "Documentation for texlive-ucalgmthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucalgmthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66602"

RPM_NAME = "texlive-ucalgmthesis-doc-2026.226.svn66602-59.2.noarch.rpm"
RPM_HASH = "957a5ebe282e06ebebf4ee0c7055839cf89ec28ce57dfb0ffc150e0058510339fffbcb89e520808bab33450139b987ae97750905d3dfdcc21c64e84d9faba2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucalgmthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
