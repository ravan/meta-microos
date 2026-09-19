SUMMARY = "Typeset metric marks for Latin text"
DESCRIPTION = "The package may be used to type the prosodics/metrics of \
(latin) verse; it provides macros to typeset the symbols \
standing alone, and in combination with symbols, giving \
automatic alignment. The package requires TikZ (including the \
calc library), xpatch, and xparse (thus also requiring the \
experimental LaTeX3 environment)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76924"

RPM_NAME = "texlive-metrix-2026.226.1.5svn76924-61.2.noarch.rpm"
RPM_HASH = "b40b8862228d7a93bf0c66d8d6df01bfd943f6449c10a42ec56b7649e09f512ec8d96d1d534e46334b6e047b356c102ac88bef68254b1820fbf0441ae9dc8244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metrix.sty \
texlive-metrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
