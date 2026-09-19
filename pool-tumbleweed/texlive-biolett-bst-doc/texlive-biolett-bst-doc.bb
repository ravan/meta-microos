SUMMARY = "Documentation for texlive-biolett-bst"
DESCRIPTION = "This package includes the documentation for texlive-biolett-bst"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-biolett-bst-doc-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "03bebf467242e93bd7f01fa0d12885a6ccb245b400922cbab7890dcafd8a48e615f3e6270771d037a418b5c29d529bf0863ac060c64c042933f167f040b1ede7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biolett-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
