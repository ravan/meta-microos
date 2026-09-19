SUMMARY = "Typesetting mathematics according to French rules"
DESCRIPTION = "The package provides capital letters in roman (upright shape) \
in mathematical mode according to French rule (can be \
optionally disabled), correct spacing in math mode after \
commas, before a semicolon and around square brackets, some \
useful macros and aliases for symbols used in France: \\infeg, \
\\supeg, \\paral, ... several macros for writing french operator \
names like pgcd, ppcm, Card, rg, Vect, ... optionally lowercase \
Greek letters in upright shape,"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn71205"

RPM_NAME = "texlive-frenchmath-2026.226.3.1svn71205-60.2.noarch.rpm"
RPM_HASH = "f5d1bea1c5b9843b33918045f5fb57cf89ab50da340566f09d61532b8f8c80c2f0f8dda2f3b52d0c0f87474c07958177d6e74ce49341341e1d63487e64aabf63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frenchmath.sty \
texlive-frenchmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsopn.sty \
tex-amstext.sty \
tex-decimalcomma.sty \
tex-dotlessj.sty \
tex-etoolbox.sty \
tex-ibrackets.sty \
tex-mathgreeks.sty \
tex-mathrsfs.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
