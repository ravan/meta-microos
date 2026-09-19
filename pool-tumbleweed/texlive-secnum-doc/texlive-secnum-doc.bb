SUMMARY = "Documentation for texlive-secnum"
DESCRIPTION = "This package includes the documentation for texlive-secnum"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-secnum-doc-2026.226.svn76924-60.2.noarch.rpm"
RPM_HASH = "9e1f071cd4f2c2627897b02953edd0a9d1ee30cbda1fdad652257b5451239592a34240bbe793c80e64828afdb12abf5d20cb31bdfe0ff94c7b84e08924ab36b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-secnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
