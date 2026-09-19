SUMMARY = "Documentation for texlive-termsim"
DESCRIPTION = "This package includes the documentation for texlive-termsim"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1.1svn76924"

RPM_NAME = "texlive-termsim-doc-2026.227.1.1.1svn76924-62.2.noarch.rpm"
RPM_HASH = "5819e60952527e193fb54e4e3f65cb7a1f702f77c5e7c0932c4327402af5280f20829f5e801e62e73f688eebebaf73c1196b4560ad349731ce5316106465ea58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-termsim-doc-zh \
texlive-termsim-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
