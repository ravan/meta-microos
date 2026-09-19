SUMMARY = "Documentation for texlive-textmerg"
DESCRIPTION = "This package includes the documentation for texlive-textmerg"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.2.01svn76924"

RPM_NAME = "texlive-textmerg-doc-2026.227.2.01svn76924-62.2.noarch.rpm"
RPM_HASH = "40a87eba99d9763497e56c5915385d679416510f7f4412702dadb8bd73f01cc8b369ce5441a3fbd953f6bb638c039b28331bb7188f22af9438593b02606e3491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textmerg-doc"

RDEPENDS:${PN} += ""

inherit rpm
