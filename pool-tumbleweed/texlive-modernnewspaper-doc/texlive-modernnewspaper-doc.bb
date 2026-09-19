SUMMARY = "Documentation for texlive-modernnewspaper"
DESCRIPTION = "This package includes the documentation for texlive-modernnewspaper"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn77279"

RPM_NAME = "texlive-modernnewspaper-doc-2026.226.0.0.2.1svn77279-61.2.noarch.rpm"
RPM_HASH = "0c5a9f91f0dc2e05974e07b14f2645f29f49d65f2d32d666ae67c76f869f3f72c35da92c7a178cd1b092da1cf5b02549b543ec2e370575a233804cbeba1ece5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modernnewspaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
