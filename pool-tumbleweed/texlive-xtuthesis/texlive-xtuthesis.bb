SUMMARY = "XTU thesis template"
DESCRIPTION = "The package provides a thesis template for the Xiangtan \
University."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-2026.226.1.0svn47049-59.4.noarch.rpm"
RPM_HASH = "5228fb3159acf054f6736c7b59ce0d366f92f24600011f0eeadfb3a8d000448bd2fc13e8f0b1dc082bd15ef05d7f096b0cc3c234858eaaa20066b43fd25a9bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtuformat.sty \
texlive-xtuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amscd.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-caption.sty \
tex-cite.sty \
tex-color.sty \
tex-graphicx.sty \
tex-latexsym.sty \
tex-mathrsfs.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
