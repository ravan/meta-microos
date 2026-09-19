SUMMARY = "Documentation for texlive-arabi"
DESCRIPTION = "This package includes the documentation for texlive-arabi"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-arabi-doc-2026.226.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "6400a4e73131bc749b58a118eedfe5daa362f0e4d0aec57475c4b4738bd8829b589bde1314525c14d7a7e0e245d665f0619f40777ff0518ec50e6e5ecc382fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabi-doc"

RDEPENDS:${PN} += ""

inherit rpm
