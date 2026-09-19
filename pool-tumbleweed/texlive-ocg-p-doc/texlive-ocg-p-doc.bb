SUMMARY = "Documentation for texlive-ocg-p"
DESCRIPTION = "This package includes the documentation for texlive-ocg-p"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn28803"

RPM_NAME = "texlive-ocg-p-doc-2026.226.0.0.4svn28803-61.2.noarch.rpm"
RPM_HASH = "590e1a0361066e1cd5335aa7c78616886cef7fae8df2ce22251d890eb45af6af762edd3c423cacb087c47ff01752646d715a972d4f05575490f86aa177a18401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocg-p-doc"

RDEPENDS:${PN} += ""

inherit rpm
