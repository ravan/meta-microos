SUMMARY = "Documentation for texlive-arabxetex"
DESCRIPTION = "This package includes the documentation for texlive-arabxetex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn77682"

RPM_NAME = "texlive-arabxetex-doc-2026.226.1.2.1svn77682-61.2.noarch.rpm"
RPM_HASH = "a52f5133137bd64ec6dfb773b7c6a2d900306f0a9379bee1baca504682fb7413ed087a24edccfd15fb828940121a839fdeea8e796bcf7944f68de89162369b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabxetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
