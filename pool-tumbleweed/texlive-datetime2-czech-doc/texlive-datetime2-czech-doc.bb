SUMMARY = "Documentation for texlive-datetime2-czech"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-czech"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47033"

RPM_NAME = "texlive-datetime2-czech-doc-2026.226.1.1svn47033-59.2.noarch.rpm"
RPM_HASH = "cdf26dde00d1b1d79c00e4f8b25e1e9850135537feb030edb7a86076338cd816f15182a0b587dae7106a370ea24f67e1062d2784492ed478f4ce2c5581dc85f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-czech-doc"

RDEPENDS:${PN} += ""

inherit rpm
