SUMMARY = "Documentation for texlive-tagpair"
DESCRIPTION = "This package includes the documentation for texlive-tagpair"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn42138"

RPM_NAME = "texlive-tagpair-doc-2026.227.1.1svn42138-62.2.noarch.rpm"
RPM_HASH = "125cffcf7d2672fba2c639534c5c4e80fe44d0805b3122d137b9b7d6e71468f74037c343533dbbfdd740db42ea0b38c8a763c7bbaa96ee990c7678337fcfee27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagpair-doc"

RDEPENDS:${PN} += ""

inherit rpm
