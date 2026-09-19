SUMMARY = "Documentation for texlive-tex-gyre-math"
DESCRIPTION = "This package includes the documentation for texlive-tex-gyre-math"
LICENSE = "LPPL-1.3c"

PV = "2026.227.svn41264"

RPM_NAME = "texlive-tex-gyre-math-doc-2026.227.svn41264-62.2.noarch.rpm"
RPM_HASH = "3ac80a8140904cbc51cea76cfa91e368628ff94983e889e794ea64b376e6e99dd1f9760d392d7f7fe18a5a18bcb533fb0368c79bf4d133bce643b56d3d9aa65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-gyre-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
