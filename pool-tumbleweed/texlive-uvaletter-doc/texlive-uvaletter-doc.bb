SUMMARY = "Documentation for texlive-uvaletter"
DESCRIPTION = "This package includes the documentation for texlive-uvaletter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn66712"

RPM_NAME = "texlive-uvaletter-doc-2026.226.1.1.1svn66712-60.2.noarch.rpm"
RPM_HASH = "3774049360d33ffeb3d8cd49380ee0c816e4fa0648a793fbb900db24ff36a3db240d5f35418f219fb3a8db0b40f8c256bdafb05962d4f80161dee01438061c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uvaletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
