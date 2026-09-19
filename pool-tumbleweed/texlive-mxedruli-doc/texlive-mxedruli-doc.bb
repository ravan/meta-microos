SUMMARY = "Documentation for texlive-mxedruli"
DESCRIPTION = "This package includes the documentation for texlive-mxedruli"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3csvn71991"

RPM_NAME = "texlive-mxedruli-doc-2026.226.3.3csvn71991-61.2.noarch.rpm"
RPM_HASH = "68cd0bd6053ed1df24615fa720be11b164ebd9f7f7c9bd9d7d04f1a87b6275c4d591f07aa1037373e9121e8de1b8d90aba19b720374b4ea9268daf1d999b36a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mxedruli-doc"

RDEPENDS:${PN} += ""

inherit rpm
