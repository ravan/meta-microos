SUMMARY = "Documentation for texlive-luwa-ul"
DESCRIPTION = "This package includes the documentation for texlive-luwa-ul"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.5svn77595"

RPM_NAME = "texlive-luwa-ul-doc-2026.226.1.2.5svn77595-59.2.noarch.rpm"
RPM_HASH = "bddc6ffc6e1f9895ef93f99a1f43e69d5935facc6210a20e567cd4d3140dd5fc1dec7c787dc4abef60118ece289253b177bd3f1d9af67fa6842f1a4bc264e158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luwa-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
