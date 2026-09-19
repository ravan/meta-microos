SUMMARY = "Documentation for texlive-ladder"
DESCRIPTION = "This package includes the documentation for texlive-ladder"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44394"

RPM_NAME = "texlive-ladder-doc-2026.226.svn44394-63.2.noarch.rpm"
RPM_HASH = "2f0e719530ce2daad67613de74acb877bd267c6633a3f5e1b6924db004e34058a298e8d55194646eb47a12f4ead44730949f86a34b30e64eaad063c65057eeae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ladder-doc"

RDEPENDS:${PN} += ""

inherit rpm
