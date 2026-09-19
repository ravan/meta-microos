SUMMARY = "Documentation for texlive-fontinst"
DESCRIPTION = "This package includes the documentation for texlive-fontinst"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.933svn74240"

RPM_NAME = "texlive-fontinst-doc-2026.226.1.933svn74240-60.2.noarch.rpm"
RPM_HASH = "45cf33163e56a6e477cbff554f9f2521957388b6f042d5754b94043eb796d4140210ac22f788453a8c53912343bad73cb65e2072caf8189d727b2fcdbadeb2f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-fontinst.1 \
texlive-fontinst-doc"

RDEPENDS:${PN} += ""

inherit rpm
