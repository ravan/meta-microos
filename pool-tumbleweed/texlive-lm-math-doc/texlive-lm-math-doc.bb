SUMMARY = "Documentation for texlive-lm-math"
DESCRIPTION = "This package includes the documentation for texlive-lm-math"
LICENSE = "LPPL-1.3c"

PV = "2026.226.1.959svn67718"

RPM_NAME = "texlive-lm-math-doc-2026.226.1.959svn67718-61.2.noarch.rpm"
RPM_HASH = "7515c052fdcc930191279416f6b678e2e1928137097885756994c9952e2133b4dd47b1bcea8be4c112556252369b484c9e97207c99bbdef316d0ef2212267237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
