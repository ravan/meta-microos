SUMMARY = "Documentation for texlive-sympycalc"
DESCRIPTION = "This package includes the documentation for texlive-sympycalc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-sympycalc-doc-2026.226.0.0.1.1svn73069-64.2.noarch.rpm"
RPM_HASH = "e9957f45ed8895a0b2c4179193864128300116d511e632ec5c1265a48ae47dd13ca31e1e8cfda19dca8074a07b1db06d5685a38eef02d7b4fec267acc5548614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sympycalc-doc-fr \
texlive-sympycalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
