SUMMARY = "Documentation for texlive-quicktype"
DESCRIPTION = "This package includes the documentation for texlive-quicktype"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-doc-2026.226.0.0.1svn42183-60.4.noarch.rpm"
RPM_HASH = "a5e366417898059ba5d795d493a8e9d0b091637b6321b90887743ca608a74a92c71138b7855ef39761487c1e991a5ac3d0f704d74ed7e7b46b73bed4c64deb12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quicktype-doc"

RDEPENDS:${PN} += ""

inherit rpm
