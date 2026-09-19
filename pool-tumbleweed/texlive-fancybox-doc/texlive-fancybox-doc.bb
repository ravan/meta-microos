SUMMARY = "Documentation for texlive-fancybox"
DESCRIPTION = "This package includes the documentation for texlive-fancybox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-fancybox-doc-2026.226.1.4svn77682-59.2.noarch.rpm"
RPM_HASH = "e1ed823cd6a34b0897e59d34b324df7b91fbb7430efb7feebdd16d49dbf4d278dc2aae15033610eb3ba612f1a2a04c30c8e4c699849b821fe17be30130bb71e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancybox-doc"

RDEPENDS:${PN} += ""

inherit rpm
