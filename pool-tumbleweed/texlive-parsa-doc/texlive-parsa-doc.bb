SUMMARY = "Documentation for texlive-parsa"
DESCRIPTION = "This package includes the documentation for texlive-parsa"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn54840"

RPM_NAME = "texlive-parsa-doc-2026.226.1.3svn54840-58.2.noarch.rpm"
RPM_HASH = "7bcd6b3d2720d585f6053d9ef64d64b4f8ff9cad75b501cbb5adf3389c3fb8fad296f15cb6b46f918db2248abb9a6e047d17da36f79738cf0cc8130ac161ae1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-parsa-doc-fa \
texlive-parsa-doc"

RDEPENDS:${PN} += ""

inherit rpm
