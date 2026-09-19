SUMMARY = "Documentation for texlive-pst-rubans"
DESCRIPTION = "This package includes the documentation for texlive-pst-rubans"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-doc-2026.226.1.2svn23464-60.4.noarch.rpm"
RPM_HASH = "603f6da6172402040645dd0fec626f6c6a9d1ce6bdd9679348af883d02a5bcffcfe737bc18c1b0bd8551ed91e66b5c10ab54409776824fceec000760257ae6a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rubans-doc"

RDEPENDS:${PN} += ""

inherit rpm
