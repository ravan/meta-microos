SUMMARY = "Documentation for texlive-magra"
DESCRIPTION = "This package includes the documentation for texlive-magra"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.0.1svn57373"

RPM_NAME = "texlive-magra-doc-2026.226.0.0.0.1svn57373-59.2.noarch.rpm"
RPM_HASH = "d16fcb9a5062eb36c88bf42794af9a81d50d0de9b3b56cd3be993833364f8d840d79b40b2e44dbf452a2f5b40af2567862dd986f3faec98407b5289a9e7d09f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magra-doc"

RDEPENDS:${PN} += ""

inherit rpm
