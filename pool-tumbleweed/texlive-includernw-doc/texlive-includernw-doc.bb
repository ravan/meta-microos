SUMMARY = "Documentation for texlive-includernw"
DESCRIPTION = "This package includes the documentation for texlive-includernw"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn47557"

RPM_NAME = "texlive-includernw-doc-2026.226.0.0.1.0svn47557-60.2.noarch.rpm"
RPM_HASH = "426d52d7fdbe675be241a74bed404bb8463ada6f31740a61b2fc93ac3eed9d2f13941d740c64ee2d73e8ba5869c5b999c82203bbadfb98e5b404c491d2cba141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-includernw-doc"

RDEPENDS:${PN} += ""

inherit rpm
