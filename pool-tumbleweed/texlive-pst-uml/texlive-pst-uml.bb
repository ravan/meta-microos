SUMMARY = "UML diagrams with PSTricks"
DESCRIPTION = "This a PSTricks package that provides support for drawing \
moderately complex UML (Universal Modelling Language) diagrams. \
(The PDF documentation is written in French.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-2026.226.0.0.83svn15878-60.4.noarch.rpm"
RPM_HASH = "76dffcb8aeda3607220678b8ba6b6c99209b38681d2aa6b3ff8132068ff9ea5558a157fba048c8d772ffa8a8c105c759bf86e441f940395bd1fbf7ce80165bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-uml.sty \
texlive-pst-uml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pst-node.sty \
tex-pst-tree.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-multido \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
