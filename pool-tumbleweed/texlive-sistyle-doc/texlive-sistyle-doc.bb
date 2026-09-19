SUMMARY = "Documentation for texlive-sistyle"
DESCRIPTION = "This package includes the documentation for texlive-sistyle"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3asvn59682"

RPM_NAME = "texlive-sistyle-doc-2026.226.2.3asvn59682-64.2.noarch.rpm"
RPM_HASH = "028418379e98bbc4bcf82d8562c46db8a11898e08a57fbf897ad58940dea966b94d600c35dcdf9d4528eeff4e16bbda7b4a5516cf867ac2cbd6bddcb64f3fd6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sistyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
