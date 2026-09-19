SUMMARY = "Documentation for texlive-pas-cv"
DESCRIPTION = "This package includes the documentation for texlive-pas-cv"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01svn32263"

RPM_NAME = "texlive-pas-cv-doc-2026.226.2.01svn32263-58.2.noarch.rpm"
RPM_HASH = "4d0cee26451fbc37d99fe7c2571da592424dada476cd092bfba1643a57bb38ea5816ebbe61a2d3f333b83620a7e308ad08c72797afe9525b2f1ed0906b1d4183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pas-cv-doc-fr \
texlive-pas-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
