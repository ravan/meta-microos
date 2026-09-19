SUMMARY = "Documentation for texlive-cormorantgaramond"
DESCRIPTION = "This package includes the documentation for texlive-cormorantgaramond"
LICENSE = "OFL-1.1"

PV = "2026.226.3.601svn71057"

RPM_NAME = "texlive-cormorantgaramond-doc-2026.226.3.601svn71057-61.2.noarch.rpm"
RPM_HASH = "cac77f8938dcd90bbee07d2db54e7dd7ca45138e347adbaf088e5013c52054ddce4fd2afce4fb2380da434b41f3146e799f94432b86da3592678019f097bcf15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cormorantgaramond-doc"

RDEPENDS:${PN} += ""

inherit rpm
