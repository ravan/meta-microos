SUMMARY = "Triple, quadruple, and n-fold paths with TikZ"
DESCRIPTION = "This library adds higher-order paths to TikZ and also fixes \
some graphical issues with TikZ' double paths, used e.g. in \
arrows with an Implies tip. It is also compatible with tikz-cd, \
adding support for triple and higher arrows. Macros to offset \
arbitrary paths are included as well."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn67718"

RPM_NAME = "texlive-tikz-nfold-2026.226.1.0.0svn67718-59.2.noarch.rpm"
RPM_HASH = "0f2397f629c2fe53cb14c5bcdf7bb21c5d55d0f0c80728d1e61f314e12b229f8c74a0ff4bbdfd13f3f0f849221ead869187c43444599b48922e5923ea4660def"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibrarybezieroffset.code.tex \
tex-pgflibrarynfold.code.tex \
tex-pgflibraryoffsetpath.code.tex \
tex-tikzlibrarynfold.code.tex \
texlive-tikz-nfold"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
