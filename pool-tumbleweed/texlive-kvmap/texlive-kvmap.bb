SUMMARY = "Create Karnaugh maps with LaTeX"
DESCRIPTION = "This LaTeX package allows the creation of (even large) Karnaugh \
maps. It provides a tabular-like input syntax and support for \
drawing bundles (implicants) around adjacent values. It is \
based on an answer at StackExchange."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.5svn67201"

RPM_NAME = "texlive-kvmap-2026.226.0.0.3.5svn67201-63.2.noarch.rpm"
RPM_HASH = "dcec005061ffcac12899a3ef59d8cee113864659ed7354f4d85f6094e56aef827638e8322349c6ec017fc5276e59081405f860ef9d6bc0dc2701d291a6d8367c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvmap.sty \
texlive-kvmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-amsmath \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3experimental \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
