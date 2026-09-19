SUMMARY = "Documentation for texlive-tikz-ladder"
DESCRIPTION = "This package includes the documentation for texlive-tikz-ladder"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn62992"

RPM_NAME = "texlive-tikz-ladder-doc-2026.226.1.3svn62992-59.2.noarch.rpm"
RPM_HASH = "dbb21720190b60eece7a06dad2611b85da11c4305a915a6a93238d42644ce04412ddf23631b610394d24a308c5157b759d0113aad065dd62125d1c6d01a56944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-ladder-doc"

RDEPENDS:${PN} += ""

inherit rpm
