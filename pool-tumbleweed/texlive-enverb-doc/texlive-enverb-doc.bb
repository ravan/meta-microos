SUMMARY = "Documentation for texlive-enverb"
DESCRIPTION = "This package includes the documentation for texlive-enverb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-enverb-doc-2026.226.1.1svn76924-61.4.noarch.rpm"
RPM_HASH = "c4c4ca8c1cf00314e83047f2ebc817b6c50464c3a918906ee38dbe8e46a7b07ce249361f2863a71253164d835845f3d70c696383434252c410cd0673947c3ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
