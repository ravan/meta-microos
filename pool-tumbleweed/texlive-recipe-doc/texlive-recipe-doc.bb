SUMMARY = "Documentation for texlive-recipe"
DESCRIPTION = "This package includes the documentation for texlive-recipe"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.9svn54080"

RPM_NAME = "texlive-recipe-doc-2026.226.0.0.9svn54080-60.4.noarch.rpm"
RPM_HASH = "5ee9f6cc511aaaba4ae3547eceedfc2b6cc84f5b8fdc6d1f84d7b5c12218ab5022c20fff2fba062dff610d7dd0f19790d779419529e30c8eceebf0c15960bc4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-recipe-doc-it \
texlive-recipe-doc"

RDEPENDS:${PN} += ""

inherit rpm
