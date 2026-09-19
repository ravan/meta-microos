SUMMARY = "Documentation for texlive-futharksymb"
DESCRIPTION = "This package includes the documentation for texlive-futharksymb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76480"

RPM_NAME = "texlive-futharksymb-doc-2026.226.1.0.1svn76480-60.2.noarch.rpm"
RPM_HASH = "01f536b7e6a79adb6f58e80655909b1546e57120e580ec7cb7bec31966a84fa3ff42836b0a5dc870c3b06f7f5d93e620ef14416ea9fa45e4a406ff07f5313c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-futharksymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
