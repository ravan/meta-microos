SUMMARY = "Documentation for texlive-libgreek"
DESCRIPTION = "This package includes the documentation for texlive-libgreek"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75712"

RPM_NAME = "texlive-libgreek-doc-2026.226.1.1svn75712-61.2.noarch.rpm"
RPM_HASH = "5be8f61470f9047c6ea4d8b2abaf229d4884db7fe4aeec3961b55a2cb25d4a770421d91666732042a7528ba91decf6991af6768c03a71dfeb4425bd2bd677b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
