SUMMARY = "Documentation for texlive-biblatex-bookinother"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bookinother"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.3svn76924"

RPM_NAME = "texlive-biblatex-bookinother-doc-2026.226.2.3.3svn76924-61.2.noarch.rpm"
RPM_HASH = "6dc32d809605c256efd1ef070ea7c122835b8b3ac10e408a02d1662607b031bf2032683d45555896379fe7b6f9323a36c566b696b979212fbafb12f6a5841fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bookinother-doc"

RDEPENDS:${PN} += ""

inherit rpm
