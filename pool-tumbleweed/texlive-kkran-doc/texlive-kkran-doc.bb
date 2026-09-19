SUMMARY = "Documentation for texlive-kkran"
DESCRIPTION = "This package includes the documentation for texlive-kkran"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.6svn78190"

RPM_NAME = "texlive-kkran-doc-2026.226.1.1.6svn78190-63.2.noarch.rpm"
RPM_HASH = "8e4ddbb975fc1cdf5fb62f7fd205c3ba1f44a27098bc2c42a370313be45e06923fbbd57c7952a6c8f8f7db56c36f7c1ec308e392c06864d4ce4869381cc55803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kkran-doc-ja \
texlive-kkran-doc"

RDEPENDS:${PN} += ""

inherit rpm
