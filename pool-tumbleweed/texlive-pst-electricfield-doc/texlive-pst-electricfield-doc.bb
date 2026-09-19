SUMMARY = "Documentation for texlive-pst-electricfield"
DESCRIPTION = "This package includes the documentation for texlive-pst-electricfield"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.14svn29803"

RPM_NAME = "texlive-pst-electricfield-doc-2026.226.0.0.14svn29803-59.2.noarch.rpm"
RPM_HASH = "34dceb2401215644014a317064630d96f5381b504151ee06acf6cf5f91f9dade98309449fa6c4f4e04faebb59db8d72ae5423a21964c9014bef015fa4f50ec65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-electricfield-doc-de;en;fr \
texlive-pst-electricfield-doc"

RDEPENDS:${PN} += ""

inherit rpm
