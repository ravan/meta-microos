SUMMARY = "Documentation for texlive-qobitree"
DESCRIPTION = "This package includes the documentation for texlive-qobitree"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-qobitree-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "49892a52e5ca425985805082f092c943c0519c958154fcfd365a87419c859d3e9b4a9dac34c80cb65e56ba05e010436e704d4c9648022d983af738ce81ab72da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qobitree-doc"

RDEPENDS:${PN} += ""

inherit rpm
