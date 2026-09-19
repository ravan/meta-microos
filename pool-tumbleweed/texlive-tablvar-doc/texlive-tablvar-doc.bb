SUMMARY = "Documentation for texlive-tablvar"
DESCRIPTION = "This package includes the documentation for texlive-tablvar"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.1svn72007"

RPM_NAME = "texlive-tablvar-doc-2026.227.2.1svn72007-62.2.noarch.rpm"
RPM_HASH = "54ffea053dce6b1d0ce8f905cd115847d64490c1f02537ce8b91211e60d2d5377a712aaf28217b1c1892b295f7228127225bc1e426f81fd435592b2eeeb308b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tablvar-doc-fr \
texlive-tablvar-doc"

RDEPENDS:${PN} += ""

inherit rpm
