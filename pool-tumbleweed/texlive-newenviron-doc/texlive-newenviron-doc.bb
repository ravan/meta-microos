SUMMARY = "Documentation for texlive-newenviron"
DESCRIPTION = "This package includes the documentation for texlive-newenviron"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn29331"

RPM_NAME = "texlive-newenviron-doc-2026.226.1.0svn29331-61.2.noarch.rpm"
RPM_HASH = "b326cc5008d11721a8b815dc840070252c41d5b76aa46386041a53a65df8e166ed521edb46c047a624fda472701ef19796018f88b3f66c1d1821af8774310d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newenviron-doc"

RDEPENDS:${PN} += ""

inherit rpm
