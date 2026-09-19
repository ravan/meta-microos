SUMMARY = "Documentation for texlive-pdftoolbox"
DESCRIPTION = "This package includes the documentation for texlive-pdftoolbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn74832"

RPM_NAME = "texlive-pdftoolbox-doc-2026.226.0.0.2svn74832-58.2.noarch.rpm"
RPM_HASH = "1d1083a48ee9cc8cb112ff4a1af396dbf2c31648cfb448f79ac4fb48539bed56ad14a8810c28f3980a20239e7b22a652f872417e808b9ef1f02f080dd92e1bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftoolbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
