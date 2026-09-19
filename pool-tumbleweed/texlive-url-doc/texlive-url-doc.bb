SUMMARY = "Documentation for texlive-url"
DESCRIPTION = "This package includes the documentation for texlive-url"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4svn77682"

RPM_NAME = "texlive-url-doc-2026.226.3.4svn77682-60.2.noarch.rpm"
RPM_HASH = "095e51686bcf774c89b4ba3c5797f426f94768ea32c688fb552a9c4dca23d72b9c84985057996456dffa8f23956cd3148de8598c99c1068317b2d41c0d382482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-url-doc"

RDEPENDS:${PN} += ""

inherit rpm
