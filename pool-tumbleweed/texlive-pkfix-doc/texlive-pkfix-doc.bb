SUMMARY = "Documentation for texlive-pkfix"
DESCRIPTION = "This package includes the documentation for texlive-pkfix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn26032"

RPM_NAME = "texlive-pkfix-doc-2026.226.1.7svn26032-58.2.noarch.rpm"
RPM_HASH = "de033fe45af2a12ef638ec2ebbc04d61e7c61a956c7b3c46fc37caa064cc900838f53735111b3519fdcda18e057579370debb625a2ea51d2a179414b008bb233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
