SUMMARY = "Documentation for texlive-sphdthesis"
DESCRIPTION = "This package includes the documentation for texlive-sphdthesis"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn34374"

RPM_NAME = "texlive-sphdthesis-doc-2026.226.1.0svn34374-64.2.noarch.rpm"
RPM_HASH = "b7b5b4fbd87d1b51b6a1681b5db84c29c56262d76a534208ba9558051aeab99fc4b73fbe47dc8cd12f920254b7b93dc7aa542b077f65a837d9042f772596dbe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sphdthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
