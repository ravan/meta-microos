SUMMARY = "Documentation for texlive-cs-techrep"
DESCRIPTION = "This package includes the documentation for texlive-cs-techrep"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn78139"

RPM_NAME = "texlive-cs-techrep-doc-2026.226.0.0.9.1svn78139-61.2.noarch.rpm"
RPM_HASH = "3dbe12f86e7cfad95420c204c7efa4beb5fbdf3f1469a4422112bd788407838b55c030a540e2b8ccabd713ee78b35a2b1f81fa0b5d85b40f6dfac1111e26a4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cs-techrep-doc"

RDEPENDS:${PN} += ""

inherit rpm
