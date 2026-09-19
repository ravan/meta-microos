SUMMARY = "Documentation for texlive-fnbreak"
DESCRIPTION = "This package includes the documentation for texlive-fnbreak"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.40svn77682"

RPM_NAME = "texlive-fnbreak-doc-2026.226.1.40svn77682-60.2.noarch.rpm"
RPM_HASH = "a470e04fcffa3b5717c9dd83c9d3d6b8709f7dd8b478a2ebc0b520bcb3ddc19edac917216378009775441a503f4acbd5c4c8ddfd7ccce55da9cfaea17ca6e8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnbreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
