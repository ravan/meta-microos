SUMMARY = "Documentation for texlive-xsim"
DESCRIPTION = "This package includes the documentation for texlive-xsim"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21svn76924"

RPM_NAME = "texlive-xsim-doc-2026.226.0.0.21svn76924-59.4.noarch.rpm"
RPM_HASH = "cc8abf7fbb90cba5ddb4fc66de58cc1a2f0145ca0149b9a020ecc17a19d4975fd887e1a88127609bde16b67d686ee841901124f39f5255c7e5646e904accfddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsim-doc"

RDEPENDS:${PN} += ""

inherit rpm
