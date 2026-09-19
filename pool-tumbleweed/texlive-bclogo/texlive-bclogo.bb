SUMMARY = "Creating colourful boxes with logos"
DESCRIPTION = "The package facilitates the creation of colorful boxes with a \
title and logo. It may use either TikZ or PSTricks as graphics \
engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.15svn77682"

RPM_NAME = "texlive-bclogo-2026.226.3.15svn77682-61.2.noarch.rpm"
RPM_HASH = "c0f40e149673c48020aff0cd4daa828e4b89f690d71c9828cc7c47926a1e3a38a1d37393ef6aa590ed3859e4b5638a42359a92715810dfa3faf704e2142a743a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bclogo.sty \
texlive-bclogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-mdframed.sty \
tex-pst-blur.sty \
tex-pst-coil.sty \
tex-pst-grad.sty \
tex-pstricks.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
