SUMMARY = "Documentation for texlive-fancynum"
DESCRIPTION = "This package includes the documentation for texlive-fancynum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.92svn15878"

RPM_NAME = "texlive-fancynum-doc-2026.226.0.0.92svn15878-59.2.noarch.rpm"
RPM_HASH = "977a950fa7465d22fe848eb08e20c49b707227dcdef76bd77753e5c23814a42fb3c69090bfad08f07acbcf45f849465e1611efb579b827eac6441fb0ca84f716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancynum-doc"

RDEPENDS:${PN} += ""

inherit rpm
