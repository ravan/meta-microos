SUMMARY = "Documentation for texlive-pst-fill"
DESCRIPTION = "This package includes the documentation for texlive-pst-fill"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-pst-fill-doc-2026.226.1.02svn77682-59.2.noarch.rpm"
RPM_HASH = "29bda319d2c92528c1523a5dfb1a8886e6ddd03a74b5430e87f308f3f4499594db889b95fbeac0ea62ee098c5050dad5521db55f047e4e67c24d6cc26ef1096a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fill-doc"

RDEPENDS:${PN} += ""

inherit rpm
