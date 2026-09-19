SUMMARY = "Documentation for texlive-lastpackage"
DESCRIPTION = "This package includes the documentation for texlive-lastpackage"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn34481"

RPM_NAME = "texlive-lastpackage-doc-2026.226.0.0.1svn34481-63.2.noarch.rpm"
RPM_HASH = "f836b6ac70cf3e928ec7cc65c77ddedab6f9603f47418de18e971822345935b7a174ef511a6a93693c08b386c1aad413bbdb2f533f4a98bd9b1d5334fe40bd36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lastpackage-doc"

RDEPENDS:${PN} += ""

inherit rpm
