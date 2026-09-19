SUMMARY = "Draw existential graphs invented by Charles S. Peirce"
DESCRIPTION = "This package is for drawing existential graphs invented and \
developed by philosopher and polymath Charles S. Peirce. It \
also contains new and unique symbols for several types of \
linear logical operators Peirce invented and used in his larger \
logical system."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn66924"

RPM_NAME = "texlive-egpeirce-2026.226.1.0.0svn66924-61.4.noarch.rpm"
RPM_HASH = "58604399c4876697a2dd701af9a526f1e9c45cf6f4b33d70e466c92b548a5de8c373f413b923880b8eca25e362979a8613f3f7c67bff9db7f15744d44e7779d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egpeirce.sty \
texlive-egpeirce"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-everypage.sty \
tex-fancybox.sty \
tex-graphicx.sty \
tex-pst-node.sty \
tex-pst-text.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
