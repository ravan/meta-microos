SUMMARY = "Documentation for texlive-liederbuch"
DESCRIPTION = "This package includes the documentation for texlive-liederbuch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn76924"

RPM_NAME = "texlive-liederbuch-doc-2026.226.1.1.0svn76924-61.2.noarch.rpm"
RPM_HASH = "0221e6337f4edaf3132f80a3863b94bdf3ff983dd3402e564bcc611a1858224270957b526dc3322443ea38082057fe2f698a48b1eb8e533ecd34da704beb4536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-liederbuch-doc"

RDEPENDS:${PN} += ""

inherit rpm
