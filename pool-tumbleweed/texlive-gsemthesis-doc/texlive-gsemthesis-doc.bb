SUMMARY = "Documentation for texlive-gsemthesis"
DESCRIPTION = "This package includes the documentation for texlive-gsemthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.4svn56291"

RPM_NAME = "texlive-gsemthesis-doc-2026.226.0.0.9.4svn56291-60.4.noarch.rpm"
RPM_HASH = "32392c94f2efc0c8b60217905b1e9ce76ee07d84b3390dbedd989f0202dd5013aecb6ac6a0c2bfd0b1053f72ce70a8ca93b38bea93c6e91e777ab612c92eca58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gsemthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
