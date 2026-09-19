SUMMARY = "Documentation for texlive-tabulary"
DESCRIPTION = "This package includes the documentation for texlive-tabulary"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.11svn77682"

RPM_NAME = "texlive-tabulary-doc-2026.227.0.0.11svn77682-62.2.noarch.rpm"
RPM_HASH = "02f31733c6f0f01a54b2360e58f7daddb47356e00ce15ecc837d1816b8072afff93af19b80ae33b9a51483c3852b237c05d2ec7680b15106b87949a5e27f776d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabulary-doc"

RDEPENDS:${PN} += ""

inherit rpm
